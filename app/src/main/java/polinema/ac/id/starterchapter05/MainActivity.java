package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.fragment.Dips;
import polinema.ac.id.starterchapter05.fragment.Handstand;
import polinema.ac.id.starterchapter05.fragment.Pushups;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlePushup(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment cekFragment = fragmentManager.findFragmentByTag("Pushups");
        if (cekFragment != null && cekFragment.isVisible()) {

        }
        else {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_right, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.frame, new Pushups(), "Pushups");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handleDips(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment cekFragment = fragmentManager.findFragmentByTag("Dips");
        if (cekFragment != null && cekFragment.isVisible()) {

        }
        else {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_right, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.frame, new Dips(), "Dips");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handleHandstand(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment cekFragment = fragmentManager.findFragmentByTag("Handstand");
        if (cekFragment != null && cekFragment.isVisible()) {

        }
        else {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_right, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.frame, new Handstand(), "Handstand");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
