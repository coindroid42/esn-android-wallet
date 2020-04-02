package com.coinomi.wallet;

import android.text.format.DateUtils;

import com.coinomi.core.coins.EscudonavacenseMain;
import com.coinomi.core.coins.BitcoinMain;
import com.coinomi.core.coins.LitecoinMain;
import com.coinomi.core.coins.DashMain;
import com.coinomi.core.coins.DogecoinMain;
import com.coinomi.core.coins.DigibyteMain;
import com.coinomi.core.coins.PeercoinMain;
import com.coinomi.core.coins.RavencoinMain;
import com.coinomi.core.coins.PivxMain;

import com.coinomi.core.coins.CoinID;
import com.coinomi.core.coins.CoinType;
import com.coinomi.core.network.CoinAddress;
import com.coinomi.stratumj.ServerAddress;
import com.google.common.collect.ImmutableList;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author John L. Jegutanis
 * @author Andreas Schildbach
 */
public class Constants {

    public static final int SEED_ENTROPY_DEFAULT = 192;
    public static final int SEED_ENTROPY_EXTRA = 256;

    public static final String ARG_SEED = "seed";
    public static final String ARG_PASSWORD = "password";
    public static final String ARG_SEED_PASSWORD = "seed_password";
    public static final String ARG_EMPTY_WALLET = "empty_wallet";
    public static final String ARG_SEND_TO_ADDRESS = "send_to_address";
    public static final String ARG_SEND_TO_COIN_TYPE = "send_to_coin_type";
    public static final String ARG_SEND_TO_ACCOUNT_ID = "send_to_account_id";
    public static final String ARG_SEND_VALUE = "send_value";
    public static final String ARG_TX_MESSAGE = "tx_message";
    public static final String ARG_COIN_ID = "coin_id";
    public static final String ARG_ACCOUNT_ID = "account_id";
    public static final String ARG_MULTIPLE_COIN_IDS = "multiple_coin_ids";
    public static final String ARG_MULTIPLE_CHOICE = "multiple_choice";
    public static final String ARG_SEND_REQUEST = "send_request";
    public static final String ARG_TRANSACTION_ID = "transaction_id";
    public static final String ARG_ERROR = "error";
    public static final String ARG_MESSAGE = "message";
    public static final String ARG_ADDRESS = "address";
    public static final String ARG_ADDRESS_STRING = "address_string";
    public static final String ARG_EXCHANGE_ENTRY = "exchange_entry";
    public static final String ARG_URI = "test_wallet";
    public static final String ARG_PRIVATE_KEY = "private_key";
    public static final String ARG_ADDRESS_TYPE_ERROR = "address_type_error";

    public static final int PERMISSIONS_REQUEST_CAMERA = 0;

    public static final String WALLET_FILENAME_PROTOBUF = "wallet";
    public static final long WALLET_WRITE_DELAY = 5;
    public static final TimeUnit WALLET_WRITE_DELAY_UNIT = TimeUnit.SECONDS;

    public static final long STOP_SERVICE_AFTER_IDLE_SECS = 30 * 60; // 30 mins

    public static final String HTTP_CACHE_NAME = "http_cache";
    public static final int HTTP_CACHE_SIZE = 256 * 1024; // 256 KiB
    public static final int NETWORK_TIMEOUT_MS = 15 * (int) DateUtils.SECOND_IN_MILLIS;

    public static final String TX_CACHE_NAME = "tx_cache";
    public static final int TX_CACHE_SIZE = 5 * 1024 * 1024; // 5 MiB, TODO currently not enforced

    public static final long RATE_UPDATE_FREQ_MS = 30 * DateUtils.SECOND_IN_MILLIS;

    /** Default currency to use if all default mechanisms fail. */
    public static final String DEFAULT_EXCHANGE_CURRENCY = "USD";

    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final Charset US_ASCII = Charset.forName("US-ASCII");

    public static final char CHAR_HAIR_SPACE = '\u200a';
    public static final char CHAR_THIN_SPACE = '\u2009';
    public static final char CHAR_ALMOST_EQUAL_TO = '\u2248';
    public static final char CHAR_CHECKMARK = '\u2713';
    public static final char CURRENCY_PLUS_SIGN = '+';
    public static final char CURRENCY_MINUS_SIGN = '-';

    public static final String MARKET_APP_URL = "market://details?id=%s";
    public static final String BINARY_URL = "https://github.com/EscudoNavacense/EscudoNavacense/releases";

    public static final String VERSION_URL = "/version";
    public static final String PARTNERS_URI = "/partner.json";
    public static final String SUPPORT_EMAIL = "support@escudonavacense.org";

    // TODO move to resource files
    public static final List<CoinAddress> DEFAULT_COINS_SERVERS = ImmutableList.of(
            new CoinAddress(EscudonavacenseMain.get(), new ServerAddress("escudonavacense-electrum.coindroid.org", 33010),
                    new ServerAddress("escudonavacense-electrum.coindroid.org", 33010)),

            new CoinAddress(BitcoinMain.get(), new ServerAddress("btc-electrum-1.coindroid.org", 5001),
                    new ServerAddress("btc-electrum-2.coindroid.org", 5001)),

            new CoinAddress(LitecoinMain.get(), new ServerAddress("ltc-electrum-1.coindroid.org", 5002),
                    new ServerAddress("ltc-electrum-2.coindroid.org", 5002)),

            new CoinAddress(DogecoinMain.get(), new ServerAddress("doge-electrum-1.coindroid.org", 5003),
                    new ServerAddress("doge-electrum-2.coindroid.org", 5003)),

            new CoinAddress(DashMain.get(), new ServerAddress("dash-electrum-1.coindroid.org", 5013),
                    new ServerAddress("dash-electrum-2.coindroid.org", 5013)),

            new CoinAddress(PivxMain.get(), new ServerAddress("pivx-electrum-1.coindroid.org", 5063),
                    new ServerAddress("pivx-electrum-2.coindroid.org", 5063)),

            new CoinAddress(DigibyteMain.get(), new ServerAddress("dgb-electrum-1.coindroid.org", 5023),
                    new ServerAddress("dgb-electrum-2.coindroid.org", 5023)),


            new CoinAddress(RavencoinMain.get(), new ServerAddress("rvn-electrum-1.coindroid.org", 50001),
                    new ServerAddress("rvn-electrum-2.coindroid.org", 50001)),

            new CoinAddress(PeercoinMain.get(), new ServerAddress("ppc-electrum-1.coindroid.org", 5004),
                    new ServerAddress("ppc-electrum-2.coindroid.org", 5004))

    );

    public static final HashMap<CoinType, Integer> COINS_ICONS;
    public static final HashMap<CoinType, String> COINS_BLOCK_EXPLORERS;
    static {
        COINS_ICONS = new HashMap<>();
        COINS_ICONS.put(CoinID.ESCUDONAVACENSE_MAIN.getCoinType(), R.drawable.escudonavacense);
        COINS_ICONS.put(CoinID.BITCOIN_MAIN.getCoinType(), R.drawable.bitcoin);
        COINS_ICONS.put(CoinID.LITECOIN_MAIN.getCoinType(), R.drawable.litecoin);
        COINS_ICONS.put(CoinID.DOGECOIN_MAIN.getCoinType(), R.drawable.dogecoin);
        COINS_ICONS.put(CoinID.DASH_MAIN.getCoinType(), R.drawable.dash);
        COINS_ICONS.put(CoinID.PIVX_MAIN.getCoinType(), R.drawable.pivx);
        COINS_ICONS.put(CoinID.DIGIBYTE_MAIN.getCoinType(), R.drawable.digibyte);
        COINS_ICONS.put(CoinID.RAVENCOIN_MAIN.getCoinType(), R.drawable.ravencoin);
        COINS_ICONS.put(CoinID.PEERCOIN_MAIN.getCoinType(), R.drawable.peercoin);


        COINS_BLOCK_EXPLORERS = new HashMap<>();
        COINS_BLOCK_EXPLORERS.put(CoinID.ESCUDONAVACENSE_MAIN.getCoinType(), "http://45.147.230.110/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.BITCOIN_MAIN.getCoinType(), "https://blockchain.info/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.LITECOIN_MAIN.getCoinType(), "http://ltc.blockr.io/tx/info/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.DOGECOIN_MAIN.getCoinType(), "https://chain.so/tx/DOGE/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.DASH_MAIN.getCoinType(), "http://explorer.dashpay.io/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.PIVX_MAIN.getCoinType(), "https://explorer.pivx.link/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.DIGIBYTE_MAIN.getCoinType(), "https://digiexplorer.info/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.RAVENCOIN_MAIN.getCoinType(), "https://ravencoin.network/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.PEERCOIN_MAIN.getCoinType(), "http://ppc.blockr.io/tx/info/%s");

    
    }

    public static final CoinType DEFAULT_COIN = BitcoinMain.get();
    public static final List<CoinType> DEFAULT_COINS = ImmutableList.of((CoinType) BitcoinMain.get());

    public static final List<CoinType> SUPPORTED_COINS = ImmutableList.of(
            EscudonavacenseMain.get(),
            BitcoinMain.get(),
            LitecoinMain.get(),
            DogecoinMain.get(),
            DashMain.get(),
            PivxMain.get(),
            DigibyteMain.get(),
            RavencoinMain.get(),
            PeercoinMain.get()
    );
}
