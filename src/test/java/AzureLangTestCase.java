
import org.junit.Test;
import org.junit.After;
import auto.*;
import core.*;

public class AzureLangTestCase {
    @Test
    public void testcase1() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        OwnerRole olofOwnershipOverStorageAcc = new OwnerRole("olofOwnershipOverStorageAcc");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addOwners(olofOwnershipOverStorageAcc);
        olofOwnershipOverStorageAcc.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase2() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        OwnerRole olofOwnershipOverResourceGroup = new OwnerRole("olofOwnershipOverResourceGroup");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob();
        FileShare fileShareX = new FileShare();
        File fileX = new File();

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addOwners(olofOwnershipOverResourceGroup);
        olofOwnershipOverResourceGroup.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase3() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olofAcc");
        OwnerRole olofOwnershipOverSubscription = new OwnerRole("olofOwnershipOverSubscription");
        Subscription subscriptionX = new Subscription("subscriptionX");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addOwners(olofOwnershipOverSubscription);
        olofOwnershipOverSubscription.addSubscriptions(subscriptionX);
        subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase4() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        ContributorRole olofContributionOverStorageAcc = new ContributorRole("olofContributionOverStorageAcc");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("Blob");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addContributors(olofContributionOverStorageAcc);
        olofContributionOverStorageAcc.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase5() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        ContributorRole olofContributionOverResourceGroup = new ContributorRole("olofContributionOverResourceGroup");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addContributors(olofContributionOverResourceGroup);
        olofContributionOverResourceGroup.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase6() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        ContributorRole olofContributionOverSubscription = new ContributorRole("olofContributionOverSubscription");
        Subscription subscriptionX = new Subscription("subscriptionX");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addContributors(olofContributionOverSubscription);
        olofContributionOverSubscription.addSubscriptions(subscriptionX);
        subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase7() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        ReaderRole olofViewOverStorageAcc = new ReaderRole("olofViewOverStorageAcc");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addReaders(olofViewOverStorageAcc);
        olofViewOverStorageAcc.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        //fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase8() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        ReaderRole olofViewOverResourceGroup = new ReaderRole("olofViewOverResourceGroup");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addReaders(olofViewOverResourceGroup);
        olofViewOverResourceGroup.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase9() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        ReaderRole olofViewOverSubscription = new ReaderRole("olofViewOverSubscription");
        Subscription subscriptionX = new Subscription("subscriptionX");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addReaders(olofViewOverSubscription);
        olofViewOverSubscription.addSubscriptions(subscriptionX);
        subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase10() {
        Credentials appXCredentials = new Credentials("appXCredentials");
        ApplicationAccount appX = new ApplicationAccount("appX");
        OwnerRole appXOwnershipOverStorageAccount = new OwnerRole("appXOwnershipOverStorageAccount");
        //Subscription subscriptionX = new Subscription();
        //ResourceGroup resourceGroupX = new ResourceGroup();
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        appXCredentials.addActiveDirectoryAccounts(appX);
        appX.addOwners(appXOwnershipOverStorageAccount);
        appXOwnershipOverStorageAccount.addStorageAccounts(storageAccountX);
        //subscriptionX.addResourceGroups(resourceGroupX);
        //resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(appXCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase11() {
        Credentials appXCredentials = new Credentials("appXCredentials");
        ApplicationAccount appX = new ApplicationAccount("appX");
        OwnerRole appXOwnershipOverResourceGroup = new OwnerRole("appXOwnershipOverResourceGroup");
        //Subscription subscriptionX = new Subscription();
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        appXCredentials.addActiveDirectoryAccounts(appX);
        appX.addOwners(appXOwnershipOverResourceGroup);
        appXOwnershipOverResourceGroup.addResourceGroups(resourceGroupX);
        //subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(appXCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase12() {
        Credentials appXCredentials = new Credentials("appXCredentials");
        ApplicationAccount appX = new ApplicationAccount("appX");
        OwnerRole appXOwnershipOverSubscription = new OwnerRole("appXOwnershipOverSubscription");
        Subscription subscriptionX = new Subscription("subscriptionX");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        appXCredentials.addActiveDirectoryAccounts(appX);
        appX.addOwners(appXOwnershipOverSubscription);
        appXOwnershipOverSubscription.addSubscriptions(subscriptionX);
        subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(appXCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase13() {
        Credentials appXCredentials = new Credentials("appXCredentials");
        ApplicationAccount appX = new ApplicationAccount("appX");
        ContributorRole appXOContributorOverStorageAccount = new ContributorRole("appXOContributorOverStorageAccount");
        //Subscription subscriptionX = new Subscription();
        //ResourceGroup resourceGroupX = new ResourceGroup();
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        appXCredentials.addActiveDirectoryAccounts(appX);
        appX.addContributors(appXOContributorOverStorageAccount);
        appXOContributorOverStorageAccount.addStorageAccounts(storageAccountX);
        //subscriptionX.addResourceGroups(resourceGroupX);
        //resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(appXCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase14() {
        Credentials appXCredentials = new Credentials("appXCredentials");
        ApplicationAccount appX = new ApplicationAccount("appX");
        ContributorRole appXOContributorOverResourceGroup = new ContributorRole("appXOContributorOverResourceGroup");
        //Subscription subscriptionX = new Subscription();
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        appXCredentials.addActiveDirectoryAccounts(appX);
        appX.addContributors(appXOContributorOverResourceGroup);
        appXOContributorOverResourceGroup.addResourceGroups(resourceGroupX);
        //subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(appXCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase15() {
        Credentials appXCredentials = new Credentials("appXCredentials");
        ApplicationAccount appX = new ApplicationAccount("appX");
        ContributorRole appXOContributorOverSubscription = new ContributorRole("appXOContributorOverSubscription");
        Subscription subscriptionX = new Subscription("subscriptionX");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        appXCredentials.addActiveDirectoryAccounts(appX);
        appX.addContributors(appXOContributorOverSubscription);
        appXOContributorOverSubscription.addSubscriptions(subscriptionX);
        subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(appXCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase16() {
        Credentials appXCredentials = new Credentials("appXCredentials");
        ApplicationAccount appX = new ApplicationAccount("appX");
        ReaderRole appXOReaderOverStorageAccount = new ReaderRole("appXOReaderOverStorageAccount");
        //Subscription subscriptionX = new Subscription();
        //ResourceGroup resourceGroupX = new ResourceGroup();
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        appXCredentials.addActiveDirectoryAccounts(appX);
        appX.addReaders(appXOReaderOverStorageAccount);
        appXOReaderOverStorageAccount.addStorageAccounts(storageAccountX);
        //subscriptionX.addResourceGroups(resourceGroupX);
        //resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(appXCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase17() {
        Credentials appXCredentials = new Credentials("appXCredentials");
        ApplicationAccount appX = new ApplicationAccount("appX");
        ReaderRole appXOReaderOverResourceGroup = new ReaderRole("appXOReaderOverResourceGroup");
        //Subscription subscriptionX = new Subscription();
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        appXCredentials.addActiveDirectoryAccounts(appX);
        appX.addReaders(appXOReaderOverResourceGroup);
        appXOReaderOverResourceGroup.addResourceGroups(resourceGroupX);
        //subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(appXCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase18() {
        Credentials appXCredentials = new Credentials("appXCredentials");
        ApplicationAccount appX = new ApplicationAccount("appX");
        ReaderRole appXOReaderOverSubscription = new ReaderRole("appXOReaderOverSubscription");
        Subscription subscriptionX = new Subscription("subscriptionX");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        appXCredentials.addActiveDirectoryAccounts(appX);
        appX.addReaders(appXOReaderOverSubscription);
        appXOReaderOverSubscription.addSubscriptions(subscriptionX);
        subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(appXCredentials.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase19() {
        SASBlobsFullAccess blobsFullAccessViaSAS = new SASBlobsFullAccess("blobsFullAccessViaSAS");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        BlockBlob objX1 = new BlockBlob("objX1");

        blobsFullAccessViaSAS.addStorageAccount(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        blobsContainerX.addBlockBlobs(objX1);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(blobsFullAccessViaSAS.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();

        objX1.read.assertCompromisedInstantaneously();
        objX1.write.assertCompromisedInstantaneously();
        objX1.delete.assertCompromisedInstantaneously();
        objX1.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase20() {
        SASBlobsReadonly blobsReadAccessViaSAS = new SASBlobsReadonly("blobsReadAccessViaSAS");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");

        blobsReadAccessViaSAS.addStorageAccount(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(blobsReadAccessViaSAS.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertUncompromised();
        objX.delete.assertUncompromised();
    }

    @Test
    public void testcase21() {
        StorageKeys keysX = new StorageKeys("keysX");
        Subscription subscriptionX = new Subscription("subscriptionX");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        BlobsContainer blobsContainerX = new BlobsContainer("blobsContainerX");
        BlockBlob objX = new BlockBlob("objX");
        FileShare fileShareX = new FileShare("fileShareX");
        File fileX = new File("fileX");

        keysX.addStorageAccount(storageAccountX);
        subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addStorageAccounts(storageAccountX);
        storageAccountX.addBlobsContainers(blobsContainerX);
        blobsContainerX.addBlockBlobs(objX);
        storageAccountX.addFileShares(fileShareX);
        fileShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(keysX.read);
        attacker.attack();

        objX.read.assertCompromisedInstantaneously();
        objX.write.assertCompromisedInstantaneously();
        objX.delete.assertCompromisedInstantaneously();
        storageAccountX.denialOfService.assertCompromisedInstantaneously();
        objX.denyAccess.assertCompromisedInstantaneously();
        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase22() {
        SASFilesFullAccess filesFullAccessViaSAS = new SASFilesFullAccess("filesFullAccessViaSAS");
        StorageAccount storageAccountX = new StorageAccount("filesShareX");
        FileShare filesShareX = new FileShare("filesShareX");
        File fileX = new File("fileX");

        filesFullAccessViaSAS.addStorageAccount(storageAccountX);
        storageAccountX.addFileShares(filesShareX);
        filesShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(filesFullAccessViaSAS.read);
        attacker.attack();

        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertCompromisedInstantaneously();
        fileX.delete.assertCompromisedInstantaneously();
        fileX.denyAccess.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase23() {
        SASFilesReadonly filesReadOnlyViaSAS = new SASFilesReadonly("filesReadOnlyViaSAS");
        StorageAccount storageAccountX = new StorageAccount("storageAccountX");
        FileShare filesShareX = new FileShare("filesShareX");
        File fileX = new File("fileX");

        filesReadOnlyViaSAS.addStorageAccount(storageAccountX);
        storageAccountX.addFileShares(filesShareX);
        filesShareX.addFiles(fileX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(filesReadOnlyViaSAS.read);
        attacker.attack();

        fileX.read.assertCompromisedInstantaneously();
        fileX.write.assertUncompromised();
        fileX.delete.assertUncompromised();
        fileX.denyAccess.assertUncompromised();
    }

    @Test
    public void testcase24() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        Network vNet1 = new Network("vNet1");
        OwnerRole olofOwnershipOverVirtualNetwork = new OwnerRole("olofOwnershipOverVirtualNetwork");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addOwners(olofOwnershipOverVirtualNetwork);
        olofOwnershipOverVirtualNetwork.addNetworks(vNet1);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        vNet1.denialOfService.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase25() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        Network vNet1 = new Network("vNet1");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        OwnerRole olofOwnershipOverResoruceGroup = new OwnerRole("olofOwnershipOverResoruceGroup");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addOwners(olofOwnershipOverResoruceGroup);
        olofOwnershipOverResoruceGroup.addResourceGroups(resourceGroupX);
        resourceGroupX.addNetworks(vNet1);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        vNet1.denialOfService.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase26() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        Network vNet1 = new Network("vNet1");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        Subscription subscriptionX = new Subscription("subscriptionX");
        OwnerRole olofOwnershipOverSubscription = new OwnerRole("olofOwnershipOverSubscription");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addOwners(olofOwnershipOverSubscription);
        olofOwnershipOverSubscription.addSubscriptions(subscriptionX);
        subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addNetworks(vNet1);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        vNet1.denialOfService.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase27() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        Network vNet1 = new Network("vNet1");
        ContributorRole olofContributorOverVirtualNetwork = new ContributorRole("olofContributorOverVirtualNetwork");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addContributors(olofContributorOverVirtualNetwork);
        olofContributorOverVirtualNetwork.addNetworks(vNet1);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        vNet1.denialOfService.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase28() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        Network vNet1 = new Network("vNet1");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        ContributorRole olofContributorOverResourceGroup = new ContributorRole("olofContributorOverResourceGroup");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addContributors(olofContributorOverResourceGroup);
        olofContributorOverResourceGroup.addResourceGroups(resourceGroupX);
        resourceGroupX.addNetworks(vNet1);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.attack();

        vNet1.denialOfService.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase29() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        OrganizationalAccount olof = new OrganizationalAccount("olof");
        Network vNet1 = new Network("vNet1");
        ResourceGroup resourceGroupX = new ResourceGroup("resourceGroupX");
        Subscription subscriptionX = new Subscription("subscriptionX");
        ContributorRole olofContributorOverSubscription = new ContributorRole("olofContributorOverSubscription");
        Machine machineX = new Machine("machineX");

        olofCredentials.addActiveDirectoryAccounts(olof);
        olof.addContributors(olofContributorOverSubscription);
        olofContributorOverSubscription.addSubscriptions(subscriptionX);
        subscriptionX.addResourceGroups(resourceGroupX);
        resourceGroupX.addNetworks(vNet1);
        machineX.addTrafficNetworks(vNet1);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.addAttackPoint(vNet1.access);
        attacker.attack();

        vNet1.denialOfService.assertCompromisedInstantaneously();
        machineX.connect.assertCompromisedInstantaneously();
    }

    @Test
    public void testcase30() {
        Credentials olofCredentials = new Credentials("olofCredentials");
        Account olof = new Account("olof");
        Network vNet1 = new Network("vNet1");
        Machine machineX = new Machine("machineX");
        Software swX = new Software("swX");

        olofCredentials.addAccounts(olof);
        machineX.addTrafficNetworks(vNet1);
        machineX.addAccounts(olof);
        swX.addExecutor(machineX);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(olofCredentials.read);
        attacker.addAttackPoint(vNet1.access);
        attacker.attack();

        machineX.connect.assertCompromisedInstantaneously();
        machineX.authenticate.assertCompromisedInstantaneously();
        swX.connect.assertCompromisedInstantaneously();
    }
    // Phising unaware users should not work when the defense step Security Aware is enabled, tho it is still working
    @Test
    public void testcase31() {
        User user1 = new User(true);
        OrganizationalAccount acc1 = new OrganizationalAccount("acc1");
        StorageAccount storageAcc1 = new StorageAccount("storageAcc1");
        BlobsContainer container1 = new BlobsContainer("container1");
        BlockBlob obj1 = new BlockBlob("obj1");
        ReaderRole readObj1 = new ReaderRole("readObj1");

        user1.addActiveDirectoryAccounts(acc1);
        acc1.addReaders(readObj1);
        storageAcc1.addBlobsContainers(container1);
        container1.addBlockBlobs(obj1);
        readObj1.addStorageAccounts(storageAcc1);

        Attacker attacker = new Attacker();
        //attacker.addAttackPoint(acc1.compromise);
        //attacker.addAttackPoint(user1.phishAwareUser);
        //attacker.addAttackPoint(user1.phishUnawareUser);
        attacker.addAttackPoint(user1.phishAwareUser);
        attacker.attack();

        obj1.read.assertCompromisedWithEffort();

    }
    @Test
    public void testcase32() {
        //Least privileges required to access, in other words, privileges needed to connect and authenticate to a windows VM
        Credentials markCredentials = new Credentials("markCredentials");
        OrganizationalAccount markAcc = new OrganizationalAccount("markAcc");
        ReaderRole win10ClientReaderRole = new ReaderRole("viewWindowsVM");
        VMUserLoginRole win10ClientLoginPrivilege = new VMUserLoginRole("win10ClientLoginPrivilege");
        // note here that access to the windows VM via RDP is disabled
        WindowsVirtualMachine win10ClientVM = new WindowsVirtualMachine("win10Client", true);
        PublicIP win10ClientPublicIP = new PublicIP("win10ClientPublicIP");
        VirtualNIC win10ClientVirualNIC = new VirtualNIC("win10ClientVirualNIC");
        Credentials win10ClientAccessKey = new Credentials("win10ClientAccessKey");

        //assign credentials to an organizational account
        markCredentials.addActiveDirectoryAccounts(markAcc);
        //assign VM access keys to the corrosponding VM
        win10ClientAccessKey.addVirtualMachine(win10ClientVM);
        //associate the NIC to the corrosponding VM
        win10ClientPublicIP.addVirtualMachine(win10ClientVM);
        //associate the Public IP to the corrosponding VM
        win10ClientVirualNIC.addVirtualMachine(win10ClientVM);

        //assign reader privilege to Mark account over the windows VM
        markAcc.addReaders(win10ClientReaderRole);
        //assign login privilege to Mark account
        markAcc.addVmUserLogin(win10ClientLoginPrivilege);
        //assign login role to the corrosponding VM
        win10ClientLoginPrivilege.addVirtualMachines(win10ClientVM);
        //assign reader role to the corrosponding VM
        win10ClientReaderRole.addVirtualMachines(win10ClientVM);
        //assign reader role to the corrosponding NIC
        win10ClientReaderRole.addVirtualNICs(win10ClientVirualNIC);
        //assign reader role to the corrosponding Public IP
        win10ClientReaderRole.addPublicIPs(win10ClientPublicIP);

        //In order for the attacker to be able to a access the VM, the attacker
        //needs to have both the access key (virtual machine local key) as well 
        //as the correct role over the relevant resources
        Attacker attacker = new Attacker();
        attacker.addAttackPoint(markCredentials.read);
        attacker.addAttackPoint(win10ClientAccessKey.read);
        attacker.attack();

        win10ClientVM.authenticatedAccess.assertCompromisedInstantaneously();
        win10ClientVM.stopMachine.assertCompromisedInstantaneously();
        win10ClientVM.startMachine.assertUncompromised();
        win10ClientVM.deleteMachine.assertUncompromised();
        // rdp access is disabled
        win10ClientVM.rdpAccess.assertUncompromised();
    }

    @Test
    public void testcase33() {
        //Least privileges required to access, in other words, privileges needed to connect and authenticate to a windows VM
        Credentials markCredentials = new Credentials("markCredentials");
        OrganizationalAccount markAcc = new OrganizationalAccount("markAcc");
        ContributorRole win10ClientContributorRole = new ContributorRole("manageWindowsVM");
        ReaderRole viewIPandNIC = new ReaderRole("viewIPandNIC");
        VMUserLoginRole win10ClientLoginPrivilege = new VMUserLoginRole("win10ClientLoginPrivilege");
        WindowsVirtualMachine win10ClientVM = new WindowsVirtualMachine("win10Client");
        PublicIP win10ClientPublicIP = new PublicIP("win10ClientPublicIP");
        VirtualNIC win10ClientVirualNIC = new VirtualNIC("win10ClientVirualNIC");
        Credentials win10ClientAccessKey = new Credentials("win10ClientAccessKey");

        //assign credentials to an organizational account
        markCredentials.addActiveDirectoryAccounts(markAcc);
        //assign VM access keys to the corrosponding VM
        win10ClientAccessKey.addVirtualMachine(win10ClientVM);
        //associate the NIC to the corrosponding VM
        win10ClientPublicIP.addVirtualMachine(win10ClientVM);
        //associate the Public IP to the corrosponding VM
        win10ClientVirualNIC.addVirtualMachine(win10ClientVM);

        //assign contributor privilege to Mark account over the windows VM
        markAcc.addContributors(win10ClientContributorRole);
        //assign reader privilage to Mark account over the NIC and Public IP
        markAcc.addReaders(viewIPandNIC);
        //assign login privilege to Mark account
        markAcc.addVmUserLogin(win10ClientLoginPrivilege);
        //assign login role to the corrosponding VM
        win10ClientLoginPrivilege.addVirtualMachines(win10ClientVM);
        //assign contributor role to the corrosponding VM
        win10ClientContributorRole.addVirtualMachines(win10ClientVM);
        //assign reader role to the corrosponding NIC
        viewIPandNIC.addVirtualNICs(win10ClientVirualNIC);
        //assign reader role to the corrosponding Public IP
        viewIPandNIC.addPublicIPs(win10ClientPublicIP);

        //In order for the attacker to be able to a access the VM, the attacker
        //needs to have both the access key (virtual machine local key) as well 
        //as the correct role over the relevant resources
        Attacker attacker = new Attacker();
        attacker.addAttackPoint(markCredentials.read);
        attacker.addAttackPoint(win10ClientAccessKey.read);
        attacker.attack();

        win10ClientVM.authenticatedAccess.assertCompromisedInstantaneously();
        win10ClientVM.stopMachine.assertCompromisedInstantaneously();
        win10ClientVM.startMachine.assertCompromisedInstantaneously();
        win10ClientVM.deleteMachine.assertCompromisedInstantaneously();
        //win10ClientPublicIP.disassociate.assertUncompromised();
        win10ClientPublicIP.delete.assertUncompromised();
        win10ClientVirualNIC.delete.assertUncompromised();
    }

    @Test
    public void testcase34() {
        //Least privileges required to access, in other words, privileges needed to connect and authenticate to a windows VM
        Credentials markCredentials = new Credentials("markCredentials");
        OrganizationalAccount markAcc = new OrganizationalAccount("markAcc");
        ReaderRole win10ClientReaderRole = new ReaderRole("viewWindowsVM");
        VMUserLoginRole win10ClientLoginPrivilege = new VMUserLoginRole("win10ClientLoginPrivilege");
        // note here that access to the windows VM via RDP is disabled
        WindowsVirtualMachine win10ClientVM = new WindowsVirtualMachine("win10Client", true);
        OSDisk osDiskX = new OSDisk("OS DISK");
        DataDisk dataDiskX = new DataDisk("DATA DISK");
        PublicIP win10ClientPublicIP = new PublicIP("win10ClientPublicIP");
        VirtualNIC win10ClientVirualNIC = new VirtualNIC("win10ClientVirualNIC");
        Credentials win10ClientAccessKey = new Credentials("win10ClientAccessKey");

        //assign credentials to an organizational account
        markCredentials.addActiveDirectoryAccounts(markAcc);
        //assign VM access keys to the corrosponding VM
        win10ClientAccessKey.addVirtualMachine(win10ClientVM);
        //associate the OS Disk to the machine
        osDiskX.addMachines(win10ClientVM);
        //associate the Data Disk to the machine
        dataDiskX.addMachines(win10ClientVM);
        //associate the NIC to the corrosponding VM
        win10ClientPublicIP.addVirtualMachine(win10ClientVM);
        //associate the Public IP to the corrosponding VM
        win10ClientVirualNIC.addVirtualMachine(win10ClientVM);

        //assign reader privilege to Mark account over the windows VM
        markAcc.addReaders(win10ClientReaderRole);
        //assign login privilege to Mark account
        markAcc.addVmUserLogin(win10ClientLoginPrivilege);
        //assign login role to the corrosponding VM
        win10ClientLoginPrivilege.addVirtualMachines(win10ClientVM);
        //assign reader role to the corrosponding VM
        win10ClientReaderRole.addVirtualMachines(win10ClientVM);
        //assign reader role to the corrosponding NIC
        win10ClientReaderRole.addVirtualNICs(win10ClientVirualNIC);
        //assign reader role to the corrosponding Public IP
        win10ClientReaderRole.addPublicIPs(win10ClientPublicIP);

        //In order for the attacker to be able to a access the VM, the attacker
        //needs to have both the access key (virtual machine local key) as well 
        //as the correct role over the relevant resources
        Attacker attacker = new Attacker();
        attacker.addAttackPoint(markCredentials.read);
        attacker.addAttackPoint(win10ClientAccessKey.read);
        attacker.attack();

        win10ClientVM.authenticatedAccess.assertCompromisedInstantaneously();
        win10ClientVM.stopMachine.assertCompromisedInstantaneously();
        win10ClientVM.startMachine.assertUncompromised();
        win10ClientVM.deleteMachine.assertUncompromised();
        // rdp access is disabled
        win10ClientVM.rdpAccess.assertUncompromised();
        // ssh access is still possible
        //win10ClientVM.sshAccess.assertCompromisedInstantaneously();

        //access to both OS and data disks is possible through authenticated access to machine
        dataDiskX.access.assertCompromisedInstantaneously();
        osDiskX.access.assertCompromisedInstantaneously();

        //In order to detach a data disk attached a VM, a contributor role is required over the VM
        dataDiskX.detach.assertUncompromised();

    }

    @Test
    public void testcase35() {
        //#############################################################//
        //### Minimum requirements for connecting remotely to a VM ###//
        //############################################################//
        //A virtual machine, could be Linux on Windows
        VirtualMachine vm1 = new VirtualMachine("vm1");
        //Virtual network interface
        VirtualNIC virtualNIC1 = new VirtualNIC("virtualNIC1");
        //Public IP to allow remote connection
        PublicIP publicIPonVM1 = new PublicIP("publicIPonVM1");
        //Access keys to authenticate to VM1
        Credentials key4VM1 = new Credentials("key4VM1");
        //An organizational aacount, active directory account
        OrganizationalAccount user1 = new OrganizationalAccount("user1");
        //Each organizational account has credentials (email as the UN and PW)
        Credentials user1Secret = new Credentials("user1Secret");
        //Reader Role to associate the RBAC privileges between an account and a resource
        ReaderRole readerRole = new ReaderRole("readerRole");
        //Beside the role Reader, it is required for a user to access the VM the role VMUserLogin
        VMUserLoginRole loginVM1 = new VMUserLoginRole();

        vm1.addVirtualNIC(virtualNIC1);
        vm1.addPublicIP(publicIPonVM1);
        vm1.addCredentials(key4VM1);

        //least privileges required to access a VM
        readerRole.addVirtualMachines(vm1);
        readerRole.addVirtualNICs(virtualNIC1);
        readerRole.addPublicIPs(publicIPonVM1);
        loginVM1.addVirtualMachines(vm1);

        //Give user1 the privilges required to access VM1
        user1.addReaders(readerRole);
        //Assign the credentials to the user
        user1.addCredentials(user1Secret);
        //assign VM user login role to the user1
        user1.addVmUserLogin(loginVM1);

        Attacker attacker = new Attacker();
        attacker.addAttackPoint(key4VM1.read);
        attacker.addAttackPoint(user1Secret.read);
        attacker.attack();

        //Can the attacker get authenticated access to VM1?
        vm1.authenticatedAccess.assertCompromisedInstantaneously();

    }

    @Test
    public void testcase36() {
        //#############################################################//
        //### Data and Accounts ###//
        //############################################################//

        Account acc1 = new Account("acc1");
        Data criticalData = new Data("critical data");

        Attacker attacker = new Attacker();
        //attacker.addAttackPoint(key4VM1.read);
        //attacker.addAttackPoint(user1Secret.read);
        attacker.attack();

    }
    @After
    public void deleteModel() {
        Asset.allAssets.clear();
        AttackStep.allAttackSteps.clear();
        Defense.allDefenses.clear();
    }
}
