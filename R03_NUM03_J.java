public static long getInteger(DataInputStream is) throws IOException{
  return is.readInt() & 0xFFFFFFFFL; //mask with 32 one-bits
}
