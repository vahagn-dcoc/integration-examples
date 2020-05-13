// automatically generated by the FlatBuffers compiler, do not modify

package SyncServer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class GameOverPacket extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static GameOverPacket getRootAsGameOverPacket(ByteBuffer _bb) { return getRootAsGameOverPacket(_bb, new GameOverPacket()); }
  public static GameOverPacket getRootAsGameOverPacket(ByteBuffer _bb, GameOverPacket obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public GameOverPacket __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public short opcode() { int o = __offset(4); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  public boolean gameSuccessful() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createGameOverPacket(FlatBufferBuilder builder,
      short opcode,
      boolean gameSuccessful) {
    builder.startTable(2);
    GameOverPacket.addOpcode(builder, opcode);
    GameOverPacket.addGameSuccessful(builder, gameSuccessful);
    return GameOverPacket.endGameOverPacket(builder);
  }

  public static void startGameOverPacket(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addOpcode(FlatBufferBuilder builder, short opcode) { builder.addShort(0, opcode, 0); }
  public static void addGameSuccessful(FlatBufferBuilder builder, boolean gameSuccessful) { builder.addBoolean(1, gameSuccessful, false); }
  public static int endGameOverPacket(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public GameOverPacket get(int j) { return get(new GameOverPacket(), j); }
    public GameOverPacket get(GameOverPacket obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

