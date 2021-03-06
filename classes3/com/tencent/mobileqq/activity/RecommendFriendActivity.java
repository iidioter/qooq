package com.tencent.mobileqq.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mobileqq.adapter.RecommendFriendAdapter;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.MayknowRecommendManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.widget.XListView;
import com.tencent.widget.immersive.ImmersiveUtils;
import java.util.ArrayList;
import mhq;
import mhr;

public class RecommendFriendActivity
  extends BaseActivity
{
  public static final int a = 88;
  private LinearLayout jdField_a_of_type_AndroidWidgetLinearLayout;
  private TextView jdField_a_of_type_AndroidWidgetTextView;
  private RecommendFriendAdapter jdField_a_of_type_ComTencentMobileqqAdapterRecommendFriendAdapter;
  FriendListObserver jdField_a_of_type_ComTencentMobileqqAppFriendListObserver;
  private MayknowRecommendManager jdField_a_of_type_ComTencentMobileqqAppMayknowRecommendManager;
  private XListView jdField_a_of_type_ComTencentWidgetXListView;
  private TextView b;
  private TextView c;
  
  public RecommendFriendActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver = new mhq(this);
  }
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    setContentView(2130903064);
    int i = getIntent().getIntExtra("EntranceId", 0);
    this.jdField_a_of_type_AndroidWidgetLinearLayout = ((LinearLayout)findViewById(2131296895));
    if (ImmersiveUtils.isSupporImmersive() == 1)
    {
      this.jdField_a_of_type_AndroidWidgetLinearLayout.setFitsSystemWindows(true);
      this.jdField_a_of_type_AndroidWidgetLinearLayout.setPadding(0, ImmersiveUtils.a(this), 0, 0);
    }
    this.c = ((TextView)findViewById(2131296898));
    this.jdField_a_of_type_ComTencentWidgetXListView = ((XListView)findViewById(2131296897));
    this.jdField_a_of_type_ComTencentMobileqqAdapterRecommendFriendAdapter = new RecommendFriendAdapter(this, this.app, this.jdField_a_of_type_ComTencentWidgetXListView, i);
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131297139));
    this.jdField_a_of_type_AndroidWidgetTextView.setVisibility(0);
    this.jdField_a_of_type_AndroidWidgetTextView.setText(2131368231);
    setTitle(getString(2131368231));
    this.b = ((TextView)findViewById(2131297083));
    this.b.setVisibility(0);
    this.b.setText(2131367975);
    this.b.setOnClickListener(new mhr(this));
    this.app.a(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
    this.jdField_a_of_type_ComTencentMobileqqAppMayknowRecommendManager = ((MayknowRecommendManager)this.app.getManager(158));
    paramBundle = this.jdField_a_of_type_ComTencentMobileqqAppMayknowRecommendManager.a();
    if (paramBundle.size() > 0)
    {
      this.jdField_a_of_type_ComTencentMobileqqAdapterRecommendFriendAdapter.a(paramBundle);
      this.c.setVisibility(8);
      return true;
    }
    this.c.setVisibility(0);
    this.jdField_a_of_type_ComTencentMobileqqAppMayknowRecommendManager.b();
    return true;
  }
  
  protected void doOnDestroy()
  {
    super.doOnDestroy();
    this.app.b(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
    if (this.jdField_a_of_type_ComTencentMobileqqAdapterRecommendFriendAdapter != null) {
      this.jdField_a_of_type_ComTencentMobileqqAdapterRecommendFriendAdapter.b();
    }
  }
  
  protected void doOnPause()
  {
    super.doOnPause();
    if (this.jdField_a_of_type_ComTencentMobileqqAdapterRecommendFriendAdapter != null) {
      this.jdField_a_of_type_ComTencentMobileqqAdapterRecommendFriendAdapter.a();
    }
  }
  
  protected void doOnResume()
  {
    super.doOnResume();
    if (this.jdField_a_of_type_ComTencentMobileqqAdapterRecommendFriendAdapter != null) {
      this.jdField_a_of_type_ComTencentMobileqqAdapterRecommendFriendAdapter.c();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\RecommendFriendActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */