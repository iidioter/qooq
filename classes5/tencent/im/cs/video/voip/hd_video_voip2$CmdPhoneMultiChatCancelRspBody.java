package tencent.im.cs.video.voip;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class hd_video_voip2$CmdPhoneMultiChatCancelRspBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_conf_id = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "bytes_conf_id" }, new Object[] { localByteStringMicro }, CmdPhoneMultiChatCancelRspBody.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\cs\video\voip\hd_video_voip2$CmdPhoneMultiChatCancelRspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */