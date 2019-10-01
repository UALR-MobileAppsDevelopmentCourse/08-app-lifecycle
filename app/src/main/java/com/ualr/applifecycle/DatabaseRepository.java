package com.ualr.applifecycle;

import java.util.concurrent.Executor;

/**
 * Created by irconde on 2019-10-01.
 */

// TODO 02. We create the DatabaseRepository calls. It simulates a database query just sleeping the thread for 10 seconds
public class DatabaseRepository {

    private Executor mExecutor;

    public DatabaseRepository(Executor executor) {
        this.mExecutor = executor;
    }

    public void getUser(final OnGetUserCallback callback) {
        this.mExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    callback.onGetUser("IVAN RODRIGUEZ-CONDE");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
