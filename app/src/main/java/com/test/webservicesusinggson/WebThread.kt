package com.test.webservicesusinggson

import android.os.AsyncTask

class WebThread : AsyncTask<Any?, Any?, UsersResponse?>(){
    override fun doInBackground(vararg params: Any?): UsersResponse? {
        return WebUtil.getUsers(1)
    }

    override fun onPostExecute(result: UsersResponse?) {
        super.onPostExecute(result)


    }
}