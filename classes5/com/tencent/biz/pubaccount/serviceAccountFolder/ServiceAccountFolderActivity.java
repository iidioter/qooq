package com.tencent.biz.pubaccount.serviceAccountFolder;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.widget.TextView;
import com.tencent.biz.pubaccount.util.PublicTracker;
import com.tencent.mobileqq.activity.fling.TopGestureLayout;
import com.tencent.mobileqq.activity.recent.cur.DragFrameLayout;
import com.tencent.mobileqq.activity.recent.cur.DragFrameLayout.OnDragModeChangedListener;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.msf.core.NetConnInfoCenter;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.theme.ThemeUtil;
import com.tencent.mobileqq.widget.QQProgressDialog;
import com.tencent.qphone.base.util.QLog;
import com.tencent.util.MqqWeakReferenceHandler;
import com.tencent.widget.SwipListView;
import com.tencent.widget.SwipListView.RightIconMenuListener;
import icj;
import ick;
import icl;
import java.util.List;
import mqq.os.MqqHandler;

public class ServiceAccountFolderActivity
  extends IphoneTitleBarActivity
  implements Handler.Callback, View.OnClickListener, DragFrameLayout.OnDragModeChangedListener, SwipListView.RightIconMenuListener
{
  public static final int a = 100;
  public static final String a = "from_source";
  public static final int b = 101;
  public static final String b = "from_msg_tab";
  public static final int c = 102;
  public static final String c = "from_search";
  private static final String d = "ServiceAccountFolderActivity";
  private View jdField_a_of_type_AndroidViewView;
  private ViewStub jdField_a_of_type_AndroidViewViewStub;
  private TextView jdField_a_of_type_AndroidWidgetTextView;
  private ServiceAccountFolderFeedAdapter jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderFeedAdapter;
  private TopGestureLayout jdField_a_of_type_ComTencentMobileqqActivityFlingTopGestureLayout;
  private DragFrameLayout jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragFrameLayout;
  private QQProgressDialog jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog;
  private SwipListView jdField_a_of_type_ComTencentWidgetSwipListView;
  private List jdField_a_of_type_JavaUtilList;
  private final MqqHandler jdField_a_of_type_MqqOsMqqHandler;
  private View jdField_b_of_type_AndroidViewView;
  private TextView jdField_b_of_type_AndroidWidgetTextView;
  private String e;
  
  public ServiceAccountFolderActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_MqqOsMqqHandler = new MqqWeakReferenceHandler(Looper.getMainLooper(), this, true);
  }
  
  private void a()
  {
    this.jdField_a_of_type_AndroidViewView = super.findViewById(2131297887);
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131297139));
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131297083));
    this.jdField_a_of_type_ComTencentWidgetSwipListView = ((SwipListView)super.findViewById(2131297950));
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog = new QQProgressDialog(this, super.getTitleBarHeight());
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.setCanceledOnTouchOutside(true);
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.b(2131364485);
    this.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragFrameLayout = DragFrameLayout.a(this);
    this.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragFrameLayout.a(this, false);
    this.jdField_a_of_type_AndroidViewViewStub = ((ViewStub)super.findViewById(2131297951));
  }
  
  private void b()
  {
    this.jdField_a_of_type_AndroidWidgetTextView.setText(ServiceAccountFolderManager.a(this.app));
    this.jdField_b_of_type_AndroidWidgetTextView.setOnClickListener(this);
    e();
  }
  
  private void c()
  {
    this.jdField_a_of_type_ComTencentWidgetSwipListView.setDragEnable(true);
    this.jdField_a_of_type_ComTencentWidgetSwipListView.setRightIconMenuListener(this);
    this.jdField_a_of_type_ComTencentWidgetSwipListView.setContentBackground(getResources().getDrawable(2130837959), false);
    this.jdField_a_of_type_ComTencentWidgetSwipListView.setBackgroundResource(2130837959);
    this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderFeedAdapter = new ServiceAccountFolderFeedAdapter(this.app, this, this.jdField_a_of_type_ComTencentWidgetSwipListView);
    this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderFeedAdapter.a(this.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragFrameLayout);
    this.jdField_a_of_type_JavaUtilList = ServiceAccountFolderManager.a().a();
    this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderFeedAdapter.a(this.jdField_a_of_type_JavaUtilList);
    this.jdField_a_of_type_ComTencentWidgetSwipListView.setAdapter(this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderFeedAdapter);
  }
  
  private void c(boolean paramBoolean)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqActivityFlingTopGestureLayout == null)
    {
      ViewGroup localViewGroup = (ViewGroup)getWindow().getDecorView();
      View localView = localViewGroup.getChildAt(0);
      Object localObject = localViewGroup;
      if (localView != null)
      {
        localObject = localViewGroup;
        if ((localView instanceof DragFrameLayout)) {
          localObject = (ViewGroup)localView;
        }
      }
      localObject = ((ViewGroup)localObject).getChildAt(0);
      if ((localObject instanceof TopGestureLayout)) {
        this.jdField_a_of_type_ComTencentMobileqqActivityFlingTopGestureLayout = ((TopGestureLayout)localObject);
      }
    }
    if (this.jdField_a_of_type_ComTencentMobileqqActivityFlingTopGestureLayout != null) {
      this.jdField_a_of_type_ComTencentMobileqqActivityFlingTopGestureLayout.setInterceptTouchFlag(paramBoolean);
    }
    if (QLog.isColorLevel()) {
      QLog.d("ServiceAccountFolderActivity", 2, "enableFlingRight->enable:" + paramBoolean);
    }
  }
  
  private void d()
  {
    View localView = super.findViewById(2131297082);
    if (localView != null) {
      IphoneTitleBarActivity.setLayerType(localView);
    }
    localView = super.findViewById(2131296706);
    if (localView != null) {
      IphoneTitleBarActivity.setLayerType(localView);
    }
    localView = super.findViewById(2131297083);
    if (localView != null) {
      IphoneTitleBarActivity.setLayerType(localView);
    }
  }
  
  private void e()
  {
    int i;
    if ((this.jdField_b_of_type_AndroidWidgetTextView != null) && ("from_msg_tab".equals(this.e)))
    {
      i = this.app.a().e();
      if (i > 0) {
        break label77;
      }
      this.jdField_b_of_type_AndroidWidgetTextView.setText(2131367566);
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d("ServiceAccountFolderActivity", 2, "updateUnreadNumOnTitleBar->unread num:" + i);
      }
      return;
      label77:
      if (i > 99) {
        this.jdField_b_of_type_AndroidWidgetTextView.setText(String.format("%s(%d+)", new Object[] { getString(2131367566), Integer.valueOf(99) }));
      } else {
        this.jdField_b_of_type_AndroidWidgetTextView.setText(String.format("%s(%d)", new Object[] { getString(2131367566), Integer.valueOf(i) }));
      }
    }
  }
  
  public void a(View paramView)
  {
    c(false);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.jdField_a_of_type_ComTencentWidgetSwipListView.setVisibility(8);
      if (ThemeUtil.isInNightMode(this.app))
      {
        this.jdField_a_of_type_AndroidViewView.setBackgroundResource(2130837959);
        if (this.jdField_b_of_type_AndroidViewView == null)
        {
          this.jdField_b_of_type_AndroidViewView = this.jdField_a_of_type_AndroidViewViewStub.inflate();
          Rect localRect = new Rect();
          getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
          int i = localRect.height();
          int j = View.MeasureSpec.makeMeasureSpec(0, 0);
          int k = View.MeasureSpec.makeMeasureSpec(0, 0);
          this.jdField_b_of_type_AndroidViewView.measure(j, k);
          i = (i - this.jdField_b_of_type_AndroidViewView.getMeasuredHeight()) / 2;
          j = (int)getResources().getDimension(2131492908);
          ((ViewGroup.MarginLayoutParams)this.jdField_b_of_type_AndroidViewView.getLayoutParams()).topMargin = (i - j);
        }
        this.jdField_b_of_type_AndroidViewView.setVisibility(0);
      }
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d("ServiceAccountFolderActivity", 2, "showEmptyView->show:" + paramBoolean);
      }
      return;
      this.jdField_a_of_type_AndroidViewView.setBackgroundColor(Color.parseColor("#f5f5f5"));
      break;
      this.jdField_a_of_type_ComTencentWidgetSwipListView.setVisibility(0);
      if (this.jdField_b_of_type_AndroidViewView != null) {
        this.jdField_b_of_type_AndroidViewView.setVisibility(8);
      }
    }
  }
  
  public void a(boolean paramBoolean, int paramInt, DragFrameLayout paramDragFrameLayout)
  {
    ServiceAccountFolderFeed localServiceAccountFolderFeed;
    long l;
    QQAppInterface localQQAppInterface;
    if ((this.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragFrameLayout.a() == -1) && (paramDragFrameLayout.a() != null) && (paramDragFrameLayout.a().getId() == 2131298785))
    {
      paramInt = ((Integer)paramDragFrameLayout.a().getTag()).intValue();
      localServiceAccountFolderFeed = (ServiceAccountFolderFeed)this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderFeedAdapter.getItem(paramInt);
      if (localServiceAccountFolderFeed != null)
      {
        l = ServiceAccountFolderManager.a().a(localServiceAccountFolderFeed);
        localQQAppInterface = this.app;
        if (!localServiceAccountFolderFeed.a()) {
          break label235;
        }
      }
    }
    label235:
    for (paramDragFrameLayout = "0";; paramDragFrameLayout = "1")
    {
      ReportController.b(localQQAppInterface, "dc00899", "Pb_account_lifeservice", "", "0X800687D", "0X800687D", 0, 0, paramDragFrameLayout, "" + localServiceAccountFolderFeed.jdField_b_of_type_Int, "" + (paramInt + 1), "" + l);
      ServiceAccountFolderManager.a().b(this.app, localServiceAccountFolderFeed, true);
      e();
      if (QLog.isColorLevel()) {
        QLog.d("ServiceAccountFolderActivity", 2, "onChange->drag red dot:" + localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString);
      }
      return;
    }
  }
  
  public void b(View paramView)
  {
    c(true);
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog != null)
    {
      if ((!paramBoolean) || (this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.isShowing())) {
        break label80;
      }
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.show();
      this.jdField_a_of_type_MqqOsMqqHandler.postDelayed(new icl(this), 5000L);
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d("ServiceAccountFolderActivity", 2, "showProgressBar->show:" + paramBoolean);
      }
      return;
      label80:
      if ((!paramBoolean) && (this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.isShowing())) {
        this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.dismiss();
      }
    }
  }
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    super.setContentView(2130903494);
    this.e = getIntent().getStringExtra("from_source");
    this.app.a(getClass(), this.jdField_a_of_type_MqqOsMqqHandler);
    a();
    b();
    c();
    d();
    ServiceAccountFolderManager.a().a(this.app, NetConnInfoCenter.getServerTime());
    return true;
  }
  
  protected void doOnDestroy()
  {
    if (this.jdField_a_of_type_MqqOsMqqHandler != null) {
      this.jdField_a_of_type_MqqOsMqqHandler.removeCallbacksAndMessages(null);
    }
    this.app.a(getClass());
    if (this.jdField_a_of_type_ComTencentWidgetSwipListView != null)
    {
      this.jdField_a_of_type_ComTencentWidgetSwipListView.setAdapter(null);
      this.jdField_a_of_type_ComTencentWidgetSwipListView.setDrawFinishedListener(null);
    }
    if (this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderFeedAdapter != null) {
      this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderFeedAdapter.a();
    }
    this.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragFrameLayout.a(this);
    if (this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog != null) {
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.dismiss();
    }
    super.doOnDestroy();
  }
  
  protected void doOnPause()
  {
    super.doOnPause();
    if (this.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragFrameLayout != null) {
      this.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragFrameLayout.a();
    }
    ServiceAccountFolderManager.a().a(this.app, NetConnInfoCenter.getServerTime());
  }
  
  protected void doOnResume()
  {
    super.doOnResume();
    ThreadManager.b(new ick(this, ServiceAccountFolderManager.a()));
    PublicTracker.a("SERVICE_FOLDER_COST", null);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 100)
    {
      this.jdField_a_of_type_MqqOsMqqHandler.removeMessages(100);
      ThreadManager.b(new icj(this));
    }
    do
    {
      return true;
      if (paramMessage.what == 101)
      {
        this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderFeedAdapter.a(this.jdField_a_of_type_JavaUtilList);
        if (this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderFeedAdapter.getCount() == 0) {}
        for (boolean bool = true;; bool = false)
        {
          a(bool);
          e();
          return true;
        }
      }
    } while (paramMessage.what != 102);
    e();
    return true;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    finish();
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\pubaccount\serviceAccountFolder\ServiceAccountFolderActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */