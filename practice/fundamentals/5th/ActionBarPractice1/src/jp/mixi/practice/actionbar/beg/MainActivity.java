
package jp.mixi.practice.actionbar.beg;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;

public class MainActivity extends SherlockActivity implements TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // �^�u�i�r�Q�[�V�������[�h�ɐݒ�
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        // �^�u���쐬���Ēǉ��B�^�u�̑I���E�����E�đI�����n���h�����O����R�[���o�b�N�� TabListener ���Z�b�g���Ȃ��Ǝ��s����O�ŃN���b�V������
        getSupportActionBar().addTab(getSupportActionBar().newTab().setText("Tab1").setTabListener(this));
        getSupportActionBar().addTab(getSupportActionBar().newTab().setText("Tab2").setTabListener(this));
        getSupportActionBar().addTab(getSupportActionBar().newTab().setText("Tab3").setTabListener(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	getSupportMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
 // �^�u�i�r�Q�[�V������ Tab ���I�����ꂽ���̃R�[���o�b�N
    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
    	Log.d("tab", "selected"+tab.getText());
        Toast.makeText(this, tab.getText(), Toast.LENGTH_SHORT).show();
    }

    // �^�u�i�r�Q�[�V������ Tab ���I���������ꂽ���̃R�[���o�b�N
    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
    	Log.d("tab", "unselected");
    }

    // �^�u�i�r�Q�[�V������ Tab ���ēx�I�����ꂽ���̃R�[���o�b�N
    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
    	Log.d("tab", "reselected");
    }
}
