package com.hesabat.twopersonmessenger
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hesabat.twopersonmessenger.databinding.ActivityCallBinding
class CallActivity:AppCompatActivity(){
 private lateinit var b:ActivityCallBinding; private var muted=false; private var speaker=false
 override fun onCreate(s:Bundle?){super.onCreate(s);b=ActivityCallBinding.inflate(layoutInflater);setContentView(b.root);window.setFlags(android.view.WindowManager.LayoutParams.FLAG_SECURE,android.view.WindowManager.LayoutParams.FLAG_SECURE)
  val video=intent.getBooleanExtra("video",false); b.callType.text=if(video)"Video zəng" else "Səsli zəng"; b.callStatus.text="Zəng serveri hələ qoşulmayıb"
  b.micBtn.setOnClickListener{muted=!muted;b.micBtn.text=if(muted)"Mikrofon bağlı" else "Mikrofon"}
  b.speakerBtn.setOnClickListener{speaker=!speaker;b.speakerBtn.text=if(speaker)"Səs açıq" else "Səs"}
  b.endBtn.setOnClickListener{finish()}
 }
}
