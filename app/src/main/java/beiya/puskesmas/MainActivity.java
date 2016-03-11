package beiya.puskesmas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.activity_main);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;

		if(view == findViewById(R.id.button2)) {
			fr = new P2();

		}else if (view == findViewById(R.id.button3)) {
			fr = new P3();

		}else if (view == findViewById(R.id.button4)) {
			fr = new P4();

		}else if (view == findViewById(R.id.button5)) {
			fr = new P5();

		}else if (view == findViewById(R.id.button6)) {
			fr = new P6();

		}else if (view == findViewById(R.id.button7)) {
			fr = new P7();

		}else if (view == findViewById(R.id.button8)) {
			fr = new P8();

		}else if (view == findViewById(R.id.button9)) {
			fr = new P9();

		}else if (view == findViewById(R.id.button10)) {
			fr = new P10();

		}else {
			fr = new P1();
		}


		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place, fr);
	     fragmentTransaction.commit();
		 
	}

	public void onBackPressed() {
		Intent intent = new Intent(Intent.ACTION_MAIN);
		intent.addCategory(Intent.CATEGORY_HOME);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intent);
	}
   
}
