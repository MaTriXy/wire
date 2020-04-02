// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: unknown_fields.proto
package com.squareup.wire.protos.kotlin.unknownfields

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireField
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

class NestedVersionOne(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  @JvmField
  val i: Int? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<NestedVersionOne, NestedVersionOne.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.i = i
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is NestedVersionOne) return false
    return unknownFields == other.unknownFields
        && i == other.i
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + i.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (i != null) result += """i=$i"""
    return result.joinToString(prefix = "NestedVersionOne{", separator = ", ", postfix = "}")
  }

  fun copy(i: Int? = this.i, unknownFields: ByteString = this.unknownFields): NestedVersionOne =
      NestedVersionOne(i, unknownFields)

  class Builder : Message.Builder<NestedVersionOne, Builder>() {
    @JvmField
    var i: Int? = null

    fun i(i: Int?): Builder {
      this.i = i
      return this
    }

    override fun build(): NestedVersionOne = NestedVersionOne(
      i = i,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<NestedVersionOne> = object : ProtoAdapter<NestedVersionOne>(
      FieldEncoding.LENGTH_DELIMITED, 
      NestedVersionOne::class, 
      "type.googleapis.com/squareup.protos.kotlin.unknownfields.NestedVersionOne"
    ) {
      override fun encodedSize(value: NestedVersionOne): Int = 
        ProtoAdapter.INT32.encodedSizeWithTag(1, value.i) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: NestedVersionOne) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.i)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): NestedVersionOne {
        var i: Int? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> i = ProtoAdapter.INT32.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return NestedVersionOne(
          i = i,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: NestedVersionOne): NestedVersionOne = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
