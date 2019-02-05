package synapsehub.m.fgm_communicator.communicator

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class Communicator : ViewModel(){

    val message =MutableLiveData<Any>()

    fun setMsgCommunicator(msg:String){
        message.setValue(msg)
    }
}