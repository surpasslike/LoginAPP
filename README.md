"制作两个独立安卓应用，一个客户端， 一个服务端。

1. 客户端提供以下功能 
    Activity
    1). 普通用户,  注册/登录/修改密码/注销用户
    2). 普通用户登录后，可以进行修改密码/注销用户，并显示 “欢迎! %用户名%”
    3). 注册信息包含但不限于 (用户名/账号/密码)
    4). 客户端不得存储用户数据

3. 服务端提供以下功能
    Activity
    1).  管理员用户， 预设一个系统用户/登录/修改密码/管理其他用户(增/删)
    2).  管理员用户登录后，跳转至修改密码/管理用户选择界面，再次选择进入对应功能界面，
    Service
    3).  提供Activity包含的所有功能接口
    4).  提供数据持久化储存功能
    5).  支持多客户端，管理员删除用户时，需要终止相关用户的权限"