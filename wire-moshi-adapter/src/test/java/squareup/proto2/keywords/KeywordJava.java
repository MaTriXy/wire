// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto2.keywords.KeywordJava in keyword_java.proto
package squareup.proto2.keywords;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireEnumConstant;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class KeywordJava extends Message<KeywordJava, KeywordJava.Builder> {
  public static final ProtoAdapter<KeywordJava> ADAPTER = new ProtoAdapter_KeywordJava();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_FINAL_ = "";

  public static final Boolean DEFAULT_PUBLIC_ = false;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      declaredName = "final"
  )
  public final String final_;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL",
      label = WireField.Label.REQUIRED,
      declaredName = "public"
  )
  public final Boolean public_;

  @WireField(
      tag = 3,
      keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      declaredName = "package"
  )
  public final Map<String, String> package_;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL",
      label = WireField.Label.REPEATED,
      declaredName = "return"
  )
  public final List<Boolean> return_;

  @WireField(
      tag = 5,
      adapter = "squareup.proto2.keywords.KeywordJava$KeywordJavaEnum#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<KeywordJavaEnum> enums;

  public KeywordJava(String final_, Boolean public_, Map<String, String> package_,
      List<Boolean> return_, List<KeywordJavaEnum> enums) {
    this(final_, public_, package_, return_, enums, ByteString.EMPTY);
  }

  public KeywordJava(String final_, Boolean public_, Map<String, String> package_,
      List<Boolean> return_, List<KeywordJavaEnum> enums, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.final_ = final_;
    this.public_ = public_;
    this.package_ = Internal.immutableCopyOf("package_", package_);
    this.return_ = Internal.immutableCopyOf("return_", return_);
    this.enums = Internal.immutableCopyOf("enums", enums);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.final_ = final_;
    builder.public_ = public_;
    builder.package_ = Internal.copyOf(package_);
    builder.return_ = Internal.copyOf(return_);
    builder.enums = Internal.copyOf(enums);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof KeywordJava)) return false;
    KeywordJava o = (KeywordJava) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(final_, o.final_)
        && public_.equals(o.public_)
        && package_.equals(o.package_)
        && return_.equals(o.return_)
        && enums.equals(o.enums);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (final_ != null ? final_.hashCode() : 0);
      result = result * 37 + public_.hashCode();
      result = result * 37 + package_.hashCode();
      result = result * 37 + return_.hashCode();
      result = result * 37 + enums.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (final_ != null) builder.append(", final=").append(Internal.sanitize(final_));
    builder.append(", public=").append(public_);
    if (!package_.isEmpty()) builder.append(", package=").append(package_);
    if (!return_.isEmpty()) builder.append(", return=").append(return_);
    if (!enums.isEmpty()) builder.append(", enums=").append(enums);
    return builder.replace(0, 2, "KeywordJava{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<KeywordJava, Builder> {
    public String final_;

    public Boolean public_;

    public Map<String, String> package_;

    public List<Boolean> return_;

    public List<KeywordJavaEnum> enums;

    public Builder() {
      package_ = Internal.newMutableMap();
      return_ = Internal.newMutableList();
      enums = Internal.newMutableList();
    }

    public Builder final_(String final_) {
      this.final_ = final_;
      return this;
    }

    public Builder public_(Boolean public_) {
      this.public_ = public_;
      return this;
    }

    public Builder package_(Map<String, String> package_) {
      Internal.checkElementsNotNull(package_);
      this.package_ = package_;
      return this;
    }

    public Builder return_(List<Boolean> return_) {
      Internal.checkElementsNotNull(return_);
      this.return_ = return_;
      return this;
    }

    public Builder enums(List<KeywordJavaEnum> enums) {
      Internal.checkElementsNotNull(enums);
      this.enums = enums;
      return this;
    }

    @Override
    public KeywordJava build() {
      if (public_ == null) {
        throw Internal.missingRequiredFields(public_, "public");
      }
      return new KeywordJava(final_, public_, package_, return_, enums, super.buildUnknownFields());
    }
  }

  public enum KeywordJavaEnum implements WireEnum {
    @WireEnumConstant(
        declaredName = "final"
    )
    final_(0),

    @WireEnumConstant(
        declaredName = "public"
    )
    public_(1),

    @WireEnumConstant(
        declaredName = "package"
    )
    package_(2),

    @WireEnumConstant(
        declaredName = "return"
    )
    return_(3);

    public static final ProtoAdapter<KeywordJavaEnum> ADAPTER = new ProtoAdapter_KeywordJavaEnum();

    private final int value;

    KeywordJavaEnum(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static KeywordJavaEnum fromValue(int value) {
      switch (value) {
        case 0: return final_;
        case 1: return public_;
        case 2: return package_;
        case 3: return return_;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }

    private static final class ProtoAdapter_KeywordJavaEnum extends EnumAdapter<KeywordJavaEnum> {
      ProtoAdapter_KeywordJavaEnum() {
        super(KeywordJavaEnum.class, Syntax.PROTO_2, KeywordJavaEnum.final_);
      }

      @Override
      protected KeywordJavaEnum fromValue(int value) {
        return KeywordJavaEnum.fromValue(value);
      }
    }
  }

  private static final class ProtoAdapter_KeywordJava extends ProtoAdapter<KeywordJava> {
    private ProtoAdapter<Map<String, String>> package_;

    public ProtoAdapter_KeywordJava() {
      super(FieldEncoding.LENGTH_DELIMITED, KeywordJava.class, "type.googleapis.com/squareup.proto2.keywords.KeywordJava", Syntax.PROTO_2, null, "keyword_java.proto");
    }

    @Override
    public int encodedSize(KeywordJava value) {
      int result = 0;
      result += ProtoAdapter.STRING.encodedSizeWithTag(1, value.final_);
      result += ProtoAdapter.BOOL.encodedSizeWithTag(2, value.public_);
      result += package_Adapter().encodedSizeWithTag(3, value.package_);
      result += ProtoAdapter.BOOL.asRepeated().encodedSizeWithTag(4, value.return_);
      result += KeywordJavaEnum.ADAPTER.asRepeated().encodedSizeWithTag(5, value.enums);
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, KeywordJava value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.final_);
      ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.public_);
      package_Adapter().encodeWithTag(writer, 3, value.package_);
      ProtoAdapter.BOOL.asRepeated().encodeWithTag(writer, 4, value.return_);
      KeywordJavaEnum.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.enums);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public void encode(ReverseProtoWriter writer, KeywordJava value) throws IOException {
      writer.writeBytes(value.unknownFields());
      KeywordJavaEnum.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.enums);
      ProtoAdapter.BOOL.asRepeated().encodeWithTag(writer, 4, value.return_);
      package_Adapter().encodeWithTag(writer, 3, value.package_);
      ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.public_);
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.final_);
    }

    @Override
    public KeywordJava decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.final_(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.public_(ProtoAdapter.BOOL.decode(reader)); break;
          case 3: builder.package_.putAll(package_Adapter().decode(reader)); break;
          case 4: builder.return_.add(ProtoAdapter.BOOL.decode(reader)); break;
          case 5: {
            try {
              builder.enums.add(KeywordJavaEnum.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public KeywordJava redact(KeywordJava value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }

    private ProtoAdapter<Map<String, String>> package_Adapter() {
      ProtoAdapter<Map<String, String>> result = package_;
      if (result == null) {
        result = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);
        package_ = result;
      }
      return result;
    }
  }
}
