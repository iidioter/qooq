import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.ChatActivityUtils.StartVideoListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class ktr
  implements DialogInterface.OnClickListener
{
  public ktr(ChatActivityUtils.StartVideoListener paramStartVideoListener)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a != null) {
      this.a.a();
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\ktr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */