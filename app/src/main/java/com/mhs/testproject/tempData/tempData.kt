package com.mhs.testproject.tempData

data class FilterData(
    val id : Int,
    val filterName : String,
    val filterDate : String
)

val filter1 = FilterData(1,"အားလုံး","01 Jan 20 - 07 Apr 23")
val filter2 = FilterData(1,"ယနေ့အတွက်","07 Apr 23")
val filter3 = FilterData(1,"မနေ့က","06 Apr 23")
val filter4 = FilterData(1,"ယခုတစ်ပတ်","01 Apr 23 - 07 Apr 23")
val filter5 = FilterData(1,"ယခင်တစ်ပတ်","25 Mar 23 - 31 Mar 23")
val filter6 = FilterData(1,"ယခုလ","Apr 23")
val filter7 = FilterData(1,"ယခင်လ","Mar 23")

val filterList = arrayListOf<FilterData>(filter1, filter2, filter3, filter4, filter5, filter6,
    filter7)

data class MemberPointData(
    val id : Int,
    val customerName : String,
    val point : Int,
    val time : String,
    val isReceive : Boolean,
    val profileImage : String,
    val configMemberPointTypeId : Int
)

val memberPoint1 = MemberPointData(1,"Jobby Jame",4590,"1 min",true,"https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlcnxlbnwwfHwwfHw%3D&w=1000&q=80",1)
val memberPoint2 = MemberPointData(2,"Wint",4590,"4 hr ago",true,"https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlcnxlbnwwfHwwfHw%3D&w=1000&q=80",1)
val memberPoint3 = MemberPointData(3,"Dev Aung",4590,"21 hr ago",true,"https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlcnxlbnwwfHwwfHw%3D&w=1000&q=80",1)
val memberPoint4 = MemberPointData(4,"Aye Thandar",4590,"1 min",true,"https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlcnxlbnwwfHwwfHw%3D&w=1000&q=80",1)
val memberPoint5 = MemberPointData(5,"Eaindray",4590,"1 min",true,"https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlcnxlbnwwfHwwfHw%3D&w=1000&q=80",1)
val memberPoint6 = MemberPointData(6,"Jobby Jame",4590,"1 min",false,"https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlcnxlbnwwfHwwfHw%3D&w=1000&q=80",8)
val memberPoint7 = MemberPointData(7,"Dev Aung",4590,"1 min",false,"https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlcnxlbnwwfHwwfHw%3D&w=1000&q=80",8)
val memberPoint8 = MemberPointData(8,"Wint",4590,"1 min",false,"https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlcnxlbnwwfHwwfHw%3D&w=1000&q=80",8)
val memberPoint9 = MemberPointData(9,"Aye Thandar",4590,"1 min",false,"https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlcnxlbnwwfHwwfHw%3D&w=1000&q=80",8)
val memberPoint10 = MemberPointData(10,"Eaindray",4590,"1 min",false,"https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlcnxlbnwwfHwwfHw%3D&w=1000&q=80",8)

val memberPointHistoryList = arrayListOf<MemberPointData>(memberPoint1, memberPoint2, memberPoint3,
    memberPoint4, memberPoint5, memberPoint6, memberPoint7, memberPoint8, memberPoint9,
    memberPoint10)