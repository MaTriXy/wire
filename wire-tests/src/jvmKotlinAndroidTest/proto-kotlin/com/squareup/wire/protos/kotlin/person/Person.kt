// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.person.Person in person.proto
@file:Suppress(
  "DEPRECATION",
  "RUNTIME_ANNOTATION_NOT_SUPPORTED",
)

package com.squareup.wire.protos.kotlin.person

import android.os.Parcelable
import com.squareup.wire.AndroidMessage
import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.missingRequiredFields
import com.squareup.wire.`internal`.redactElements
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import okio.ByteString

/**
 * Message representing a person, includes their name, unique ID number, email and phone number.
 */
public class Person(
  /**
   * The customer's ID number.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.REQUIRED,
    schemaIndex = 0,
  )
  public val id: Int,
  /**
   * The customer's full name.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REQUIRED,
    schemaIndex = 1,
  )
  public val name: String,
  /**
   * Email address for the customer.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 2,
  )
  public val email: String? = null,
  phone: List<PhoneNumber> = emptyList(),
  aliases: List<String> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : AndroidMessage<Person, Nothing>(ADAPTER, unknownFields) {
  /**
   * A list of the customer's phone numbers.
   */
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.protos.kotlin.person.Person${'$'}PhoneNumber#ADAPTER",
    label = WireField.Label.REPEATED,
    schemaIndex = 3,
  )
  public val phone: List<PhoneNumber> = immutableCopyOf("phone", phone)

  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED,
    schemaIndex = 4,
  )
  public val aliases: List<String> = immutableCopyOf("aliases", aliases)

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Person) return false
    if (unknownFields != other.unknownFields) return false
    if (id != other.id) return false
    if (name != other.name) return false
    if (email != other.email) return false
    if (phone != other.phone) return false
    if (aliases != other.aliases) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + id.hashCode()
      result = result * 37 + name.hashCode()
      result = result * 37 + (email?.hashCode() ?: 0)
      result = result * 37 + phone.hashCode()
      result = result * 37 + aliases.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """id=$id"""
    result += """name=${sanitize(name)}"""
    if (email != null) result += """email=${sanitize(email)}"""
    if (phone.isNotEmpty()) result += """phone=$phone"""
    if (aliases.isNotEmpty()) result += """aliases=${sanitize(aliases)}"""
    return result.joinToString(prefix = "Person{", separator = ", ", postfix = "}")
  }

  public fun copy(
    id: Int = this.id,
    name: String = this.name,
    email: String? = this.email,
    phone: List<PhoneNumber> = this.phone,
    aliases: List<String> = this.aliases,
    unknownFields: ByteString = this.unknownFields,
  ): Person = Person(id, name, email, phone, aliases, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Person> = object : ProtoAdapter<Person>(
      FieldEncoding.LENGTH_DELIMITED, 
      Person::class, 
      "type.googleapis.com/squareup.protos.kotlin.person.Person", 
      PROTO_2, 
      null, 
      "person.proto"
    ) {
      override fun encodedSize(`value`: Person): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.id)
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.email)
        size += PhoneNumber.ADAPTER.asRepeated().encodedSizeWithTag(4, value.phone)
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, value.aliases)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Person) {
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.id)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.email)
        PhoneNumber.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.phone)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, value.aliases)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Person) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, value.aliases)
        PhoneNumber.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.phone)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.email)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.id)
      }

      override fun decode(reader: ProtoReader): Person {
        var id: Int? = null
        var name: String? = null
        var email: String? = null
        val phone = mutableListOf<PhoneNumber>()
        val aliases = mutableListOf<String>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            2 -> id = ProtoAdapter.INT32.decode(reader)
            1 -> name = ProtoAdapter.STRING.decode(reader)
            3 -> email = ProtoAdapter.STRING.decode(reader)
            4 -> phone.add(PhoneNumber.ADAPTER.decode(reader))
            5 -> aliases.add(ProtoAdapter.STRING.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return Person(
          id = id ?: throw missingRequiredFields(id, "id"),
          name = name ?: throw missingRequiredFields(name, "name"),
          email = email,
          phone = phone,
          aliases = aliases,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Person): Person = value.copy(
        phone = value.phone.redactElements(PhoneNumber.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    @JvmField
    public val CREATOR: Parcelable.Creator<Person> = AndroidMessage.newCreator(ADAPTER)

    private const val serialVersionUID: Long = 0L
  }

  /**
   * Represents the type of the phone number: mobile, home or work.
   */
  public enum class PhoneType(
    override val `value`: Int,
  ) : WireEnum {
    MOBILE(0),
    HOME(1),
    /**
     * Could be phone or fax.
     */
    WORK(2),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<PhoneType> = object : EnumAdapter<PhoneType>(
        PhoneType::class, 
        PROTO_2, 
        PhoneType.MOBILE
      ) {
        override fun fromValue(`value`: Int): PhoneType? = PhoneType.fromValue(`value`)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): PhoneType? = when (`value`) {
        0 -> MOBILE
        1 -> HOME
        2 -> WORK
        else -> null
      }
    }
  }

  public class PhoneNumber(
    /**
     * The customer's phone number.
     */
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REQUIRED,
      schemaIndex = 0,
    )
    public val number: String,
    /**
     * The type of phone stored here.
     */
    @field:WireField(
      tag = 2,
      adapter = "com.squareup.wire.protos.kotlin.person.Person${'$'}PhoneType#ADAPTER",
      schemaIndex = 1,
    )
    public val type: PhoneType? = null,
    unknownFields: ByteString = ByteString.EMPTY,
  ) : AndroidMessage<PhoneNumber, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    override fun newBuilder(): Nothing = throw AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is PhoneNumber) return false
      if (unknownFields != other.unknownFields) return false
      if (number != other.number) return false
      if (type != other.type) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + number.hashCode()
        result = result * 37 + (type?.hashCode() ?: 0)
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      result += """number=${sanitize(number)}"""
      if (type != null) result += """type=$type"""
      return result.joinToString(prefix = "PhoneNumber{", separator = ", ", postfix = "}")
    }

    public fun copy(
      number: String = this.number,
      type: PhoneType? = this.type,
      unknownFields: ByteString = this.unknownFields,
    ): PhoneNumber = PhoneNumber(number, type, unknownFields)

    public companion object {
      @JvmField
      public val DEFAULT_TYPE: PhoneType = PhoneType.HOME

      @JvmField
      public val ADAPTER: ProtoAdapter<PhoneNumber> = object : ProtoAdapter<PhoneNumber>(
        FieldEncoding.LENGTH_DELIMITED, 
        PhoneNumber::class, 
        "type.googleapis.com/squareup.protos.kotlin.person.Person.PhoneNumber", 
        PROTO_2, 
        null, 
        "person.proto"
      ) {
        override fun encodedSize(`value`: PhoneNumber): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.number)
          size += PhoneType.ADAPTER.encodedSizeWithTag(2, value.type)
          return size
        }

        override fun encode(writer: ProtoWriter, `value`: PhoneNumber) {
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.number)
          PhoneType.ADAPTER.encodeWithTag(writer, 2, value.type)
          writer.writeBytes(value.unknownFields)
        }

        override fun encode(writer: ReverseProtoWriter, `value`: PhoneNumber) {
          writer.writeBytes(value.unknownFields)
          PhoneType.ADAPTER.encodeWithTag(writer, 2, value.type)
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.number)
        }

        override fun decode(reader: ProtoReader): PhoneNumber {
          var number: String? = null
          var type: PhoneType? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> number = ProtoAdapter.STRING.decode(reader)
              2 -> try {
                type = PhoneType.ADAPTER.decode(reader)
              } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
                reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
              }
              else -> reader.readUnknownField(tag)
            }
          }
          return PhoneNumber(
            number = number ?: throw missingRequiredFields(number, "number"),
            type = type,
            unknownFields = unknownFields
          )
        }

        override fun redact(`value`: PhoneNumber): PhoneNumber = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      @JvmField
      public val CREATOR: Parcelable.Creator<PhoneNumber> = AndroidMessage.newCreator(ADAPTER)

      private const val serialVersionUID: Long = 0L
    }
  }
}
