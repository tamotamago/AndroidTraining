
package jp.mixi.practice.interaction.beg;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockActivity implements OnNavigationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
     // List Navigation �̃��X�g�ɕ\���������
        List<String> list = new ArrayList<String>();
        list.add("Navi Menu 1");
        list.add("Navi Menu 2");
        list.add("Navi Menu 3");
        // �i�r�Q�[�V�������[�h�� List Navigation �ɐݒ�
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        // List Navigation �̏���
        getSupportActionBar().setListNavigationCallbacks(
                new ArrayAdapter<String>(getApplicationContext(),
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1, list),
                this);
        // �^�C�g����\�����Ȃ��悤�ɂ���
        getSupportActionBar().setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
    	// TODO Auto-generated method stub
    	return super.onPrepareOptionsMenu(menu);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getSupportMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_LONG).show();
    	return super.onOptionsItemSelected(item);
    }
    
    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
    	// TODO Auto-generated method stub
    	return false;
    }
}
