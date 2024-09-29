package br.com.vivabem;

import org.json.JSONObject;

public class Hello {

    public static void main(String[] args) {
        
        System.out.println("hello world!");
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("nome","joao");
        jsonObject.put("cpf","11144477708");
        jsonObject.put("dt_nascimento","23/10/1983");
        jsonObject.put("cargo","porteiro");
        jsonObject.put("salario","2000.00");
        jsonObject.put("data_admissao","15/09/2023");


        String jsonString = jsonObject.toString();
        System.out.println(jsonString);
    }
}
