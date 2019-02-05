package synapsehub.m.fgm_communicator.fragment

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import synapsehub.m.fgm_communicator.R
import synapsehub.m.fgm_communicator.communicator.Communicator


public class ReceiveFragment: Fragment() {

    companion object {
        lateinit var mctx:Context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val myView=LayoutInflater.from(container!!.context).inflate(R.layout.fragment2,container,false)

        mctx=container!!.context
        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn=view.findViewById<View>(R.id.btnBack) as Button
        val txt=view.findViewById<View>(R.id.txreceiver) as TextView

        val model=ViewModelProviders.of(activity!!).get(Communicator::class.java)

        model.message.observe(this, object : Observer<Any> {
            override fun onChanged(o: Any?) {
                txt.text = o!!.toString()
            }
        })
        btn.setOnClickListener { view ->

        }
    }


    fun receiveText(data:String):String{
        return data
    }

}