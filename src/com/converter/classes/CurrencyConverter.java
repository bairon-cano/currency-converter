package com.converter.classes;

import java.util.ArrayList;

public final class CurrencyConverter extends Converter {

    private final String colombianCurrency = "COP(Colombian Peso)";
    private final String dolarCurrency = "USD(Dolar)";
    private final String euroCurrency = "EUR(Euro)";
    private final String sterlingCurrency = "GBP(British Pound)";
    private final String japaneseYenCurrency = "JPY(Japanese Yen)";
    private final String southKoreanWonCurrency = "KRW(South Korean Won)";

    private final Dactum dolarToCop = new Dactum(dolarCurrency, 4043.28, colombianCurrency);
    private final Dactum euroToCop = new Dactum(euroCurrency, 4408.34, colombianCurrency);
    private final Dactum sterlingToCop = new Dactum(sterlingCurrency, 5122.23, colombianCurrency);
    private final Dactum japaneseYenToCop = new Dactum(japaneseYenCurrency, 28.10, colombianCurrency);
    private final Dactum southKoreanWonToCop = new Dactum(southKoreanWonCurrency, 3.09, colombianCurrency);

    private final Dactum euroToDolar = new Dactum(euroCurrency, 1.09, dolarCurrency);
    private final Dactum sterlingToDolar = new Dactum(sterlingCurrency, 1.27, dolarCurrency);
    private final Dactum japaneseYenToDolar = new Dactum(japaneseYenCurrency, 0.0070, dolarCurrency);
    private final Dactum southKoreanWonToDolar = new Dactum(southKoreanWonCurrency, 0.00077, dolarCurrency);

    private final Dactum sterlingToEuro = new Dactum(sterlingCurrency, 1.16, euroCurrency);
    private final Dactum japaneseYenToEuro = new Dactum(japaneseYenCurrency, 0.0064, euroCurrency);
    private final Dactum southKoreanWonToEuro = new Dactum(southKoreanWonCurrency, 0.00070, euroCurrency);

    private final Dactum japaneseYenToSterling = new Dactum(japaneseYenCurrency, 0.0055, sterlingCurrency);
    private final Dactum southKoreanWonToSterling = new Dactum(southKoreanWonCurrency, 0.00061, sterlingCurrency);

    private final Dactum southKoreanWonToJapaneseYen = new Dactum(southKoreanWonCurrency, 0.11, japaneseYenCurrency);

    public CurrencyConverter(String nameConverter) {
        super.setNameConverter(nameConverter);
        addData();
    }

    @Override
    public void addData() {
        listData.add(dolarToCop);
        listData.add(euroToCop);
        listData.add(sterlingToCop);
        listData.add(japaneseYenToCop);
        listData.add(southKoreanWonToCop);

        listData.add(euroToDolar);
        listData.add(sterlingToDolar);
        listData.add(japaneseYenToDolar);
        listData.add(southKoreanWonToDolar);

        listData.add(sterlingToEuro);
        listData.add(japaneseYenToEuro);
        listData.add(southKoreanWonToEuro);

        listData.add(japaneseYenToSterling);
        listData.add(southKoreanWonToSterling);

        listData.add(southKoreanWonToJapaneseYen);
    }

    @Override
    public ArrayList<String> addListItems() {
        listItems.add(dolarCurrency);
        listItems.add(euroCurrency);
        listItems.add(sterlingCurrency);
        listItems.add(japaneseYenCurrency);
        listItems.add(southKoreanWonCurrency);
        listItems.add(colombianCurrency);
        return listItems;
    }
}
