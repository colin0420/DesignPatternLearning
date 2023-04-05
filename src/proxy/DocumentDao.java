package proxy;

public class DocumentDao implements AbstractDocumentDao {
    @Override
    public boolean deleteDocumentById(String documentId) {
        if (documentId.equalsIgnoreCase("D001")) {
            System.out.println("删除ID为" + documentId + "的文档信息成功");
            return true;
        }
        System.out.println("删除ID为" + documentId + "的文档信息失败");
        return false;
    }
}
