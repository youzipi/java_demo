# -*- coding: utf-8 -*
import sys
import urllib2,urllib,re
from bs4 import BeautifulSoup

reload(sys)
sys.setdefaultencoding('utf-8')

#伪装成浏览器
headers = { 'User-Agent':'Mozilla/5.0 (Windows; U; Windows NT 6.1;en-US; rv:1.9.1.6) Gecko/20091201 Firefox/3.5.6'}

def load(url):
    try:
        html = urllib2.urlopen(url).read()
    except(urllib2.HTTPError):
        return 0
    soup = BeautifulSoup(html,from_encoding='GB18030')
    title = soup.head.title
    #print type(title)   #<class 'bs4.element.Tag'>
    print title.string
    #print type(title.string)   #<class 'bs4.element.NavigableString'>
    title = str(title)
    print type(title)
    t = soup.find_all("p")
    count = 0
    text = ""
    for i in t:
        print count
        body = str(i.string)
        if body == "None":
            body = "\n"
        print body.decode('utf-8')#.encode('gb2312')
        text  = text+body+"\n"
        s = raw_input()
        print text.decode('utf-8')
        count+=1


    print "count:%d" % count
    print body

    
    
    
url = "http://www.tuicool.com/articles/Fruiqyj"
#url = "http://cs.nuist.edu.cn/toArticle.action?id=2336"
url = "http://news.163.com/14/0516/22/9SDAH8JQ00014JB5.html"

#download(url)
    
