package marscoin.android.wallet;

import android.os.Build;
import android.os.Bundle;

public class TRANSACTION() {

    public var from = emptyArray<String>(); /* public key of the sender */
    public var to = emptyArray<String>(); /* public key of the receiver */
    public var quantity = emptyArray<int>(); /* amount of marsoshies received by each public key | each value can be void */
    public String message; /* message included in the transaction | can be void */
    public String signature; /* signature of the transaction */
    
};

public class LEGACYPUBLICKEY() {

    public String KEY; /* public key | can be void */
    public int NUMBER; /* number that needs to be used when generating the public key using the private key | required */
    
};

public class WALLET() {

    public String PRIVATEKEY; /* can be void if PASSPHRASE isn't null */
    public String PASSPHRASE; /* can be void if PRIVATEKEY isn't null */
    public var legacy_public_keys = emptyArray<LEGACYPUBLICKEY>(); /* array of all the public keys generated and restored from the wallet.dat / wallet.maw file */
    public var transactions = emptyArray<TRANSACTION>(); /* array of all the known transactions, recovered from on chain data and from the wallet.dat / wallet.maw file */
    
};

public class main extends Activity () {

    override fun onCreate(savedInstance : Bundle) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    };
    
};
