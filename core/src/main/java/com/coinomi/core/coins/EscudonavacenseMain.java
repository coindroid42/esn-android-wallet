package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author main@m42.cx
 */
public class EscudonavacenseMain extends BitFamily {
    private EscudonavacenseMain() {
        id = "escudonavacense.main"; // Do not change this id as wallets serialize this string
        addressHeader = 34;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 161;

        name = "EscudoNavacense";
        symbol = "ESN";
        uriScheme = "escudonavacense";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 DASH mininput
        softDustLimit = value(100000); // 0.001 DASH
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Escudonavacense Signed Message:\n");

    }

    private static EscudonavacenseMain instance = new EscudonavacenseMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
