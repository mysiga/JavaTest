package com.mysiga.learn.rxjava;

/**
 * Created by Wilson on 2018/8/26.
 */
public class Observable<T> {
    public interface OnSubscribe<T> {
        void call(Subscriber<? super T> subscriber);
    }

    private OnSubscribe<T> onSubscribe;

    public Observable(OnSubscribe<T> onSubscribe) {
        this.onSubscribe = onSubscribe;
    }

    public static <T> Observable<T> create(OnSubscribe<T> onSubscribe) {
        return new Observable<T>(onSubscribe);
    }

    public void subscribe(Subscriber<? super T> subscriber) {
        subscriber.onStart();
        onSubscribe.call(subscriber);
    }

    public interface Transformer<T, R> {
        R call(T t);
    }

    public <R> Observable<R> map(final Transformer<? super T, ? extends R> transform) {
        return create(new OnSubscribe<R>() {
            @Override
            public void call(Subscriber<? super R> subscriber) {
                Observable.this.subscribe(new Subscriber<T>() {
                    @Override
                    public void completed() {
                        subscriber.completed();
                    }

                    @Override
                    public void onError(Throwable t) {
                        subscriber.onError(t);
                    }

                    @Override
                    public void onNext(T var1) {
                        subscriber.onNext(transform.call(var1));
                    }
                });
            }
        });
    }

    public static class MapOnSubscriber<T, R> implements OnSubscribe {
        private Observable<T> sourse;
        private Transformer<? super T, ? extends R> transformerf;

        public MapOnSubscriber(Observable<T> sourse, Transformer<? super T, ? extends R> transformerf) {
            this.sourse = sourse;
            this.transformerf = transformerf;
        }

        @Override
        public void call(Subscriber subscriber) {
            sourse.subscribe(new MapSubscriber<R, T>(subscriber, transformerf));
        }
    }

    public static class MapSubscriber<T, R> extends Subscriber<R> {
        private Subscriber<T> action;
        private Transformer<? super R, ? extends T> transformer;

        public MapSubscriber(Subscriber<T> action, Transformer<? super R, ? extends T> transformer) {
            this.action = action;
            this.transformer = transformer;
        }

        @Override
        public void completed() {
            action.completed();
        }

        @Override
        public void onError(Throwable t) {
            action.onError(t);
        }

        @Override
        public void onNext(R var1) {
            action.onNext(transformer.call(var1));
        }

    }

    public static void main(String[] args) {
        Observable.create(new OnSubscribe<Object>() {
            @Override
            public void call(Subscriber subscriber) {
                for (int i = 0; i < 5; i++) {
                    subscriber.onNext(i);
                }

            }
        }).map(new Transformer<Object, Object>() {
            @Override
            public Object call(Object o) {
                return o + "transformer";
            }
        }).subscribe(new <Object>Subscriber() {
            @Override
            public void completed() {
                System.out.println("completed()");
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("onError()");
            }

            @Override
            public void onNext(Object var1) {
                System.out.println("onNext()," + var1);
            }
        });
    }
}
