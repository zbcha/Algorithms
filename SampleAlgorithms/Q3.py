#Bochao Zhang
#B00748967
#Assignment 3
#Question 3

color=['red','green','yellow']
CBI=0
MAL=0
for CapeBreton in range(3):
    for Inverness in range(3):
        for Richmond in range(3):
            if(Richmond == CapeBreton and Richmond == Inverness):
                continue
            for Victoria in range(3):
                if(Victoria == CapeBreton and Victoria == Inverness):
                    continue
                CBI+=1

for Annapolis in range(3):
    for Antigonish in range(3):
        for Colchester in range(3):
            for Cumberland in range(3):
                if(Cumberland == Colchester):
                    continue
                for Digby in range(3):
                    if(Digby == Annapolis):
                        continue
                    for Guysborough in range(3):
                        if(Guysborough == Antigonish):
                            continue
                        for Halifax in range(3):
                            if(Halifax == Colchester and Halifax == Guysborough):
                                continue
                            for Hants in range(3):
                                if(Hants==Annapolis and Hants == Halifax):
                                    continue
                                for Kings in range(3):
                                    if(Kings==Annapolis and Kings == Hants):
                                        continue
                                    for Lunenburg in range(3):
                                        if(Lunenburg==Annapolis and Lunenburg == Halifax and Lunenburg==Hants and Lunenburg==Kings):
                                            continue
                                        for Pictou in range(3):
                                            if(Pictou == Antigonish and Pictou == Colchester and Pictou == Guysborough):
                                                continue
                                            for Queens in range(3):
                                                if(Queens == Annapolis and Queens == Digby and Queens == Lunenburg):
                                                    continue
                                                for Shelburne in range(3):
                                                    if(Shelburne == Queens):
                                                        continue
                                                    for Yarmouth in range(3):
                                                        if(Yarmouth==Digby and Yarmouth == Shelburne):
                                                            continue
                                                        MAL+=1
                                                        
print("There are "+str(CBI*MAL)+" ways to color the map")

