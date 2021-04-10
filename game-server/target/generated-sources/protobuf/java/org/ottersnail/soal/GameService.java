// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game-service.proto

package org.ottersnail.soal;

public final class GameService {
  private GameService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DiceRollRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DiceRollRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GameBoardStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GameBoardStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DiceRollResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DiceRollResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Dice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Dice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022game-service.proto\032\037google/protobuf/ti" +
      "mestamp.proto\032\033google/protobuf/empty.pro" +
      "to\"(\n\017DiceRollRequest\022\025\n\rplayer_number\030\001" +
      " \001(\005\":\n\017GameBoardStatus\022\020\n\010position\030\001 \001(" +
      "\005\022\025\n\005event\030\002 \001(\0162\006.Event\"T\n\020DiceRollResp" +
      "onse\022\023\n\004dice\030\001 \001(\0132\005.Dice\022+\n\021game_board_" +
      "status\030\002 \001(\0132\020.GameBoardStatus\"\025\n\004Dice\022\r" +
      "\n\005value\030\001 \001(\005*;\n\005Event\022\010\n\004MOVE\020\000\022\t\n\005SNAK" +
      "E\020\001\022\n\n\006LADDER\020\002\022\007\n\003WIN\020\003\022\010\n\004LOSE\020\0042Q\n\032Sn" +
      "akesOnALadderGameService\0223\n\010rollDice\022\020.D" +
      "iceRollRequest\032\021.DiceRollResponse(\0010\001B\027\n" +
      "\023org.ottersnail.soalP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_DiceRollRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DiceRollRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DiceRollRequest_descriptor,
        new java.lang.String[] { "PlayerNumber", });
    internal_static_GameBoardStatus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GameBoardStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GameBoardStatus_descriptor,
        new java.lang.String[] { "Position", "Event", });
    internal_static_DiceRollResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_DiceRollResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DiceRollResponse_descriptor,
        new java.lang.String[] { "Dice", "GameBoardStatus", });
    internal_static_Dice_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Dice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Dice_descriptor,
        new java.lang.String[] { "Value", });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
