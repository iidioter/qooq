import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.FrameLayout;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import cooperation.qzone.video.interact.RecordSVInteractActivity;

public class yqp
  implements ValueAnimator.AnimatorUpdateListener
{
  public yqp(RecordSVInteractActivity paramRecordSVInteractActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    paramValueAnimator = (Integer)paramValueAnimator.getAnimatedValue();
    FrameLayout localFrameLayout = RecordSVInteractActivity.a(this.a);
    if (paramValueAnimator != null) {}
    for (int i = paramValueAnimator.intValue();; i = 0)
    {
      localFrameLayout.setPadding(0, 0, 0, i);
      return;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\yqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */