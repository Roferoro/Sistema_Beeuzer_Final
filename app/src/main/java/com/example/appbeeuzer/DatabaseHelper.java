package com.example.appbeeuzer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "db_beeuzer";
    public static final String USUARIO_TABLE_NAME ="tbuser";
    public static final String USUARIO_COLUMN_ID = "_id";
    public static final String USUARIO_COLUMN_NAME = "nome";
    public static final String USUARIO_COLUMN_EMAIL = "email";
    public static final String USUARIO_COLUMN_SENHA = "senha";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)  {
        String sqlQuery =
                String.format("create table %s ( %s integer primary key autoincrement, %s text, %s text, %s text)",
                        USUARIO_TABLE_NAME,
                        USUARIO_COLUMN_ID,
                        USUARIO_COLUMN_NAME,
                        USUARIO_COLUMN_EMAIL,
                        USUARIO_COLUMN_SENHA
                );

        db.execSQL(sqlQuery);
        ContentValues contentValues = new ContentValues();

        contentValues.put(USUARIO_COLUMN_NAME,"admin");
        contentValues.put(USUARIO_COLUMN_EMAIL, "admin@gmail.com");
        contentValues.put(USUARIO_COLUMN_SENHA, "123");

        db.insert(USUARIO_TABLE_NAME, null, contentValues) ;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      //  db.execSQL("DROP TABLE IF EXISTS " + USUARIO_TABLE_NAME);
        //onCreate(db);
    }

    public boolean usuarioExiste(Usuario user) {
        String email = user.getEmail();
        String senha = user.getSenha();

        SQLiteDatabase db = this.getReadableDatabase();

        String sqlQuery = String.
                format("SELECT * FROM %s WHERE %s = '%s' AND %s = '%s'",
                        USUARIO_TABLE_NAME, USUARIO_COLUMN_EMAIL, email, USUARIO_COLUMN_SENHA, senha);

        Log.v("EMAIL", email);
        Log.v("PASSWORD", email);

        Cursor res = db.rawQuery(sqlQuery, null);
        Log.v("ROWS", String.valueOf(res.getCount()));

        if (res.getCount() > 0) {
            return true;
        }

        res.close();

        return false;
    }

    public boolean insertUser(Usuario user) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put(USUARIO_COLUMN_NAME, user.getNome());
        contentValues.put(USUARIO_COLUMN_EMAIL, user.getEmail());
        contentValues.put(USUARIO_COLUMN_SENHA, user.getSenha());

        return db.insert(USUARIO_TABLE_NAME, null, contentValues) > 0;
    }

    public ArrayList<Usuario> allUsers() {
        ArrayList<Usuario> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery("SELECT * FROM " + USUARIO_TABLE_NAME, null);
        res.moveToFirst();

        while (!res.isAfterLast()) {
            int i;
            Usuario u = new Usuario();

            i = res.getColumnIndex(USUARIO_COLUMN_ID);
            u.setId(res.getInt(i));

            i = res.getColumnIndex(USUARIO_COLUMN_NAME);
            u.setNome(res.getString(i));


            i = res.getColumnIndex(USUARIO_COLUMN_EMAIL);
            u.setEmail(res.getString(i));
            Log.v("USUARIO_EMAIL", res.getString(i));

            i = res.getColumnIndex(USUARIO_COLUMN_SENHA);
            u.setSenha(res.getString(i));
            Log.v("USUARIO_SENHA", res.getString(i));

            arrayList.add(u);
            res.moveToNext();
        }
        res.close();
        return arrayList;
    }
}
