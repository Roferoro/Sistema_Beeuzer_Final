package com.example.appbeeuzer;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

    public class Usuario  implements  Serializable {

        private long _id;
        private String nome;
        private String email;
        private String senha;


        public Usuario(String nome, String email, String senha) {
            this.nome = nome;
            this.senha = senha;
            this.email = email;
        }
        public Usuario(int _id, String nome, String email, String senha){
            this._id = _id;
            this.nome = nome;
            this.senha = senha;
            this.email = email;
        }

        public Usuario(){
            this.nome = "";
            this.senha = "";
            this.email = "";
        }
        public void setId(int id){
            this._id= id;
        }

        public long getId(){

            return this._id;
        }

        public String getNome(){

            return this.nome;
        }

        public void setNome(String nome){this.nome = nome;}

        public String getSenha(){

            return this.senha;
        }

        public void setSenha(String senha){this.senha = senha;}

        public String getEmail(){
            return this.email;
        }

        public void setEmail(String email){this.email = email;}

        public JSONObject getJsonObject(){
            JSONObject obj = new JSONObject();
            try{
                obj.put("id", this._id);
                obj.put("nome", this.nome);
                obj.put("email", this.email);
                obj.put("senha", this.senha);
            }
            catch (JSONException e){ }
            return obj;
        }
}
