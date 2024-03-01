public void deleteFile(){
  File soemFile = new File("someFileName.txt");
  //DO something woth someFile
  if(!someFile.delete()){
    //handle failure to delete the file
  }
}
