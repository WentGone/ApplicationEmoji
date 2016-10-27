package went_gone.applicationemoji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText mET;
    private Button mBtn;
    private TextView mTVcontent;
    private ImageView mIVExpression;
    private RecyclerView mRVexpression;
    private List<EmojiBean> emojiBeens;
    private ExpressionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initDatas();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mET = (EditText) findViewById(R.id.Main_ET);
        mBtn = (Button) findViewById(R.id.Main_Btn);
        mTVcontent = (TextView) findViewById(R.id.Main_TV_content);
        mIVExpression = (ImageView) findViewById(R.id.Main_IM);
        mRVexpression = (RecyclerView) findViewById(R.id.Main_RecyclerView);

        GridLayoutManager manager = new GridLayoutManager(this,5,GridLayoutManager.VERTICAL,false);
        mRVexpression.setLayoutManager(manager);
        adapter = new ExpressionAdapter(emojiBeens,this);
        mRVexpression.setAdapter(adapter);

        adapter.setItemChildClickListener(new ItemChildClickListener() {
            @Override
            public void onChildClick(int position) {
                mET.append(adapter.getItem(position).getEmojiString());
            }
        });

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mET.getText().toString().equals("")){
                    mTVcontent.append(mET.getText().toString());
                }
            }
        });
        mIVExpression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mRVexpression.getVisibility() == View.VISIBLE){
                    mRVexpression.setVisibility(View.GONE);
                }else {
                    mRVexpression.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void initDatas() {
        emojiBeens = new ArrayList<>();
        emojiBeens = EmojiDao.getInstance().getEmojiBean();
    }

}
