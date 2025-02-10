// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.Percents in percents_in_kdoc.proto
import Wire

public struct Percents {

    /**
     * e.g. "No limits, free to send and just 2.75% to receive".
     */
    @ProtoDefaulted
    public var text: String?
    /**
     * Testing very long field name in builders.
     */
    @ProtoDefaulted
    public var very_very_long_field_name_placeholder_1_with_very_long_same_placeholder_2_and_different_placeholder_3: Int32?
    public var unknownFields: UnknownFields = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension Percents : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Percents : Hashable {
}
#endif

extension Percents : Sendable {
}

extension Percents : ProtoDefaultedValue {

    public static var defaultedValue: Self {
        .init()
    }
}

extension Percents : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.kotlin.Percents"
    }

}

extension Percents : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var text: String? = nil
        var very_very_long_field_name_placeholder_1_with_very_long_same_placeholder_2_and_different_placeholder_3: Int32? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: text = try protoReader.decode(String.self)
            case 2: very_very_long_field_name_placeholder_1_with_very_long_same_placeholder_2_and_different_placeholder_3 = try protoReader.decode(Int32.self, encoding: .variable)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self._text.wrappedValue = text
        self._very_very_long_field_name_placeholder_1_with_very_long_same_placeholder_2_and_different_placeholder_3.wrappedValue = very_very_long_field_name_placeholder_1_with_very_long_same_placeholder_2_and_different_placeholder_3
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.text)
        try protoWriter.encode(tag: 2, value: self.very_very_long_field_name_placeholder_1_with_very_long_same_placeholder_2_and_different_placeholder_3, encoding: .variable)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Percents : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self._text.wrappedValue = try container.decodeIfPresent(String.self, forKey: "text")
        self._very_very_long_field_name_placeholder_1_with_very_long_same_placeholder_2_and_different_placeholder_3.wrappedValue = try container.decodeIfPresent(Int32.self, firstOfKeys: "veryVeryLongFieldNamePlaceholder1WithVeryLongSamePlaceholder2AndDifferentPlaceholder3", "very_very_long_field_name_placeholder_1_with_very_long_same_placeholder_2_and_different_placeholder_3")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)
        let preferCamelCase = encoder.protoKeyNameEncodingStrategy == .camelCase

        try container.encodeIfPresent(self.text, forKey: "text")
        try container.encodeIfPresent(self.very_very_long_field_name_placeholder_1_with_very_long_same_placeholder_2_and_different_placeholder_3, forKey: preferCamelCase ? "veryVeryLongFieldNamePlaceholder1WithVeryLongSamePlaceholder2AndDifferentPlaceholder3" : "very_very_long_field_name_placeholder_1_with_very_long_same_placeholder_2_and_different_placeholder_3")
    }

}
#endif
