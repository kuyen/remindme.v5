package tw.geodoer.main.taskList.cardsui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geodoer.geotodo.R;

import it.gmariotti.cardslib.library.internal.Card;

/**
 * Class MyCursorCard *
 */
public class MyCursorCard extends Card {

    public String dueDate;
    public String LocationName;
    public String Notifications;
    public String mainHeader;
    public int resourceIdThumb;

    public MyCursorCard(Context context) {
        super(context, R.layout.card_cursor_inner_content);
    }

    @Override
    public void setShadow(boolean shadow) {
        super.setShadow(shadow);
        if(shadow){
            getCardView()
                    .getInternalShadowLayout()
                    .getInternalOuterView()
                    .setBackgroundResource(R.drawable.card_shadow_hightlight);
    }
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {

        // Retrieve elements
        TextView mTitleTextView = (TextView) parent
                .findViewById(R.id.card_cursor_main_inner_title);
        TextView mSecondaryTitleTextView = (TextView) parent
                .findViewById(R.id.card_cursor_main_inner_subtitle);
        TextView mThirdTitleTextView = (TextView) parent
                .findViewById(R.id.card_cursor_main_inner_thirdtitle);

        if (mTitleTextView != null)
            mTitleTextView.setText(dueDate);

        if (mSecondaryTitleTextView != null)
            mSecondaryTitleTextView.setText(LocationName);

        if (mThirdTitleTextView != null)
            mThirdTitleTextView.setText(Notifications);
    }
}
