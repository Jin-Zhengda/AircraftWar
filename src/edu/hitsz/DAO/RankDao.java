package edu.hitsz.DAO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface RankDao {
    List<String> getAllRecords() throws IOException;

    void addRecord(String user, String date, String score) throws IOException;

    void deleteRecord(String user, String date) throws IOException;

    void deleteRecord(int row) throws IOException;

    void rankSort() throws IOException;

    void printRanks() throws IOException;

    String[][] getSortRecordsArray() throws IOException;
}
