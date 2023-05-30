package org.example;

import java.util.Objects;

public class HashMake {
    //리스트를 요소로 갖는 리스트
    //해시값,key,value 해시값이 같아도 key가 다르면 저장 위치가 달라서 관리 가능
    private static int hash_table_size = 100;
    //hashtable 클래스를 새로 선언, 그 안에 있던 key와 value에 데이터 저장
    private HashTable[] table = new HashTable[hash_table_size];
    private int size = 0;

    //해시로 변환
    public int getHash(Integer key) {
        return key % 10;
    }

    //해시 값으로 변환해서 테이블에 저장
    public void saveData(Integer key, String value) {
        int hashValue = getHash(key);
        table[hashValue] = new HashTable(key, value);
        size++;
    }

    //데이터 출력
    public Object readValue(Integer key) {
        int hashValue = getHash(key);
        return table[hashValue].value;
    }

    public void deleteData(Integer key) {
        int hashValue = getHash(key);
        table[hashValue] = null;
        size--;


    }

    int size() {
        return size;
    }
}
