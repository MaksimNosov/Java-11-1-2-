import ru.netology.domain.PurchaseMovie;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    private ProductRepository repo;

    public ProductManager(ProductRepository repo) {
        this.repo = repo;
    }

//    private int limit = 2;

    public PurchaseMovie[] getMovies() {
        PurchaseMovie[] all = repo.findAll();
        PurchaseMovie[] reversed = new PurchaseMovie[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

//    public PurchaseMovie[] getLastMovie() {
//        PurchaseMovie[] all = repo.findAll();
//
//        int length;
//        if (getMovies().length < limit) {
//            length = getMovies().length;
//        } else {
//            length = limit;
//        }
//        PurchaseMovie[] tmp = new PurchaseMovie[length];
//
//        for (int i = 0; i < tmp.length; i++) {
//            tmp[i] = all[all.length - 1 - i];
//        }
//        return tmp;
//    }
}
