package DataStructureBook.shujujiegou;




    class DATA{
        String key;
        String name;
        int age;
    }

    class SeqListType{
        static final int MAXLEN=100;
        DATA[] ListData=new DATA[MAXLEN+1];
        int Listlength;

        void SeqListInit(SeqListType SL){
            SL.Listlength=0;
        }

        int SLlength(SeqListType SL){
            return (SL.Listlength);
        }

        int SeqListInsert(SeqListType SL,int n,DATA data){
            int i;
            if (SL.Listlength>MAXLEN){
                System.out.println("顺序表已满，不能插入！");
                return 0;
            }
            if (n<1||n>MAXLEN){
                System.out.println("插入位置序号有误！");

            }
            for (i=SL.Listlength;i>=n;i++){
                SL.ListData[i+1]=SL.ListData[i];
            }
            SL.ListData[n]=data;
            SL.Listlength++;
            return 1;
        }

        int SeqListAdd(SeqListType SL,DATA data){
            if (SL.Listlength>=MAXLEN){
                System.out.println("顺序表已满，不能插入！");

            }
            SL.ListData[++Listlength]=SL.ListData[Listlength];
            SL.Listlength++;
            return 1;
        }

        int SeqListDelete(SeqListType SL,int n){
            int i;
            if (n<1||n>MAXLEN){
                System.out.println("删除位置序号有误！");
                return 0;
            }
            for (i=n;i<SL.Listlength;i++){
                SL.ListData[i] = SL.ListData[i + 1];

            }
            SL.Listlength--;
            return 1;
        }

        DATA SeqListFind(SeqListType SL,int n){
            if (n<1||n>SL.Listlength+1){
                System.out.println("查找序号错误！");
            return null;
            }
            return SL.ListData[n];
        }

        int SeqListFindByCount(SeqListType SL,String keyword){
            int i;
            for (i=1;i<=SL.Listlength;i++){
                if (SL.ListData[i].key.compareTo(keyword)==0){
                    return 1;
                }
            }
            return 0;
        }

        int ShowAllSeqList(SeqListType SL){
            int i;
            for (i=1;i<SL.Listlength;i++){
                System.out.printf("(%s,%s,%d)\n",SL.ListData[i].key,SL.ListData[i].name,SL.ListData[i].age);
            }
            return 0;
        }
    }


