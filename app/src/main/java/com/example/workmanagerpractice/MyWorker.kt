package com.example.workmanagerpractice

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

/**
 * Created by Prateek Sharma on 06/08/21.
 */

/**
 * This class contains work which we need to perform in background
 */
class MyWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    // Code inside this is executed in the background
    override fun doWork(): Result {

        return Result.success()
    }
}