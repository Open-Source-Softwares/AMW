package android.marscoin.wallet;

import android.os.Build;
import android.os.Bundle;

public class TRANSACTION() {

    public var FROM = emptyArray<String>(); /* public key of the sender */
    public var TO = emptyArray<String>(); /* public key of the receiver */
    public var QUANTITIES = emptyArray<int>(); /* amount of marsoshies received by each public key | each value can be void */
    public String message; /* message included in the transaction | can be void */
    public String signature; /* signature of the transaction */
    
};

public class PRIVATEKEY() {

    public String KEY; /* private key | can be void if not generated yet or if  */
    public var input; /* the datas that need to be put inside the hashing algorithm in order to get the private key | can be void if KEY isn't null or if the input datas didn't get created yet*/
    
    public fun generate() { /* generate a private key using the value of the input var */

        
        
    };
    public fun generateFromScratch() { /* generate a private key  */

        
        
    };
    
};

public class LEGACYPUBLICKEY() {

    public String KEY; /* public key | can be void */
    public int NUMBER; /* number that needs to be used when generating the public key using the private key | required */

    public fun generate(String privateKey) {

        
        
    };
    
};

public class WALLET() {

    public var privateKeys = emptyArray<String>(); /* can be void if PASSPHRASE isn't null */
    public var passPhrases = emptyArray<String>(); /* can be void if PRIVATEKEY isn't null */
    public var legacyPublicKeys = emptyArray<LEGACYPUBLICKEY>(); /* array of all the public keys generated and restored from the wallet.dat / wallet.maw file */
    public var transactions = emptyArray<TRANSACTION>(); /* array of all the known transactions, recovered from on chain data and from the wallet.dat / wallet.maw file */
    
};

public class main extends Activity () {

    override fun onCreate(savedInstance : Bundle) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    };
    
};
