def tower(l):
    ## YOUR CODE HERE
    ans = l[0]
    l = l[1:]
    leftovers = []
    for i in l:
        to_adds = []
        for person in i:
            if person not in ans:
                to_adds.append(person)
        if len(to_adds) == 0: # store in queue
            leftovers.append(ans)
            continue
        for to_add in to_adds:            
            add_index = i.index(to_add)

            add_at = None
            for name in reversed(i[:add_index]):
                if name in ans:
                    add_at = name
                    break
            if add_at is None:
                for name in i[add_index + 1:]:
                    if name in ans:
                        add_at = name
                        break
#            add_at = next((name for name in i if name in ans))
            if i.index(add_at) < i.index(to_add):
                ans.insert(ans.index(add_at) + 1, to_add)
            elif i.index(add_at) > i.index(to_add) and ans.index(add_at) == 0:
                ans.insert(ans.index(add_at), to_add)
            else:
                ans.insert(ans.index(add_at), to_add)
    return ans
    '''
    ans = l[0] 
    for i in l: 
        for j in i: 
            if j in ans: 
                ind = ans.index(j)
                end = ans[ind:]
                ans = ans[0: ind-1].append(j)
            else: 
                ans.append(j)
    return ans
    '''


## DO NOT MODIFY BELOW THIS LINE

if __name__ == '__main__':
    with open('TowerTycoonIN.txt','r') as f:
        while True:
            s = f.readline()
            if s == '':
                break
            s = int(s)
            l = []
            for i in range(s):
                l.append(f.readline().strip().split())
            print('[' + ', '.join(tower(l)) + ']')