
import requests
import json

def main():
    #Stores url of json file on internet
    kipling_loop_url = 'https://myttc.ca/kipling_loop.json'
    #Sends a request to the website
    kipling_loop_request = requests.get(kipling_loop_url)
    #Stores the request in a json file?
    kipling_loop = kipling_loop_request.json()
    #Gets the times in the json file
    kipling_loop_1 = kipling_loop['stops'][0]['routes'][0]['stop_times'][0]['departure_time']
    kipling_loop_2 = kipling_loop['stops'][0]['routes'][0]['stop_times'][1]['departure_time']
    kipling_loop_3 = kipling_loop['stops'][0]['routes'][0]['stop_times'][2]['departure_time']

    #For system time millis, kipling_loop['stops'][0]['routes'][0]['stop_times'][0]['departure_timestamp']

    print("Kipling Loop")
    print(kipling_loop_1)
    print(kipling_loop_2)
    print(kipling_loop_3 + "\n")




    tim_hortons_url = 'https://myttc.ca/northbound_on_colonel_samuel_at_humber_college_building_m.json'
    tim_hortons_request = requests.get(tim_hortons_url)

    tim_hortons = tim_hortons_request.json()
    tim_hortons_1 = tim_hortons['stops'][0]['routes'][0]['stop_times'][0]['departure_time']
    tim_hortons_2 = tim_hortons['stops'][0]['routes'][0]['stop_times'][1]['departure_time']
    tim_hortons_3 = tim_hortons['stops'][0]['routes'][0]['stop_times'][2]['departure_time']

    print("Tim Hortons")
    print(tim_hortons_1)
    print(tim_hortons_2)
    print(tim_hortons_3 + "\n")


    #names refer to west side and east side(not going west bound or east bound)
    west_lake_url = 'https://myttc.ca/lake_shore_and_colonel_samuel-kipling.json'
    west_lake_request = requests.get(west_lake_url)

    west_lake = west_lake_request.json()

    west_lake_301_1 = {west_lake['stops'][0]['routes'][0]['stop_times'][0]['shape'][0:3]: west_lake['stops'][0]['routes'][0]['stop_times'][0]['departure_time']}
    west_lake_301_2 = {west_lake['stops'][0]['routes'][0]['stop_times'][1]['shape'][0:3]: west_lake['stops'][0]['routes'][0]['stop_times'][1]['departure_time']}
    west_lake_301_3 = {west_lake['stops'][0]['routes'][0]['stop_times'][2]['shape'][0:3]: west_lake['stops'][0]['routes'][0]['stop_times'][2]['departure_time']}

    west_lake_501_1 = {west_lake['stops'][0]['routes'][1]['stop_times'][0]['shape'][0:3]: west_lake['stops'][0]['routes'][1]['stop_times'][0]['departure_time']}
    west_lake_501_2 = {west_lake['stops'][0]['routes'][1]['stop_times'][0]['shape'][0:3]: west_lake['stops'][0]['routes'][1]['stop_times'][1]['departure_time']}
    west_lake_501_3 = {west_lake['stops'][0]['routes'][1]['stop_times'][0]['shape'][0:3]: west_lake['stops'][0]['routes'][1]['stop_times'][2]['departure_time']}

    west_lake_508_1 = {west_lake['stops'][0]['routes'][2]['stop_times'][0]['shape'][0:3]: west_lake['stops'][0]['routes'][2]['stop_times'][0]['departure_time']}
    west_lake_508_2 = {west_lake['stops'][0]['routes'][2]['stop_times'][0]['shape'][0:3]: west_lake['stops'][0]['routes'][2]['stop_times'][1]['departure_time']}

    print("West Side Bus")
    print(west_lake_301_1)
    print(west_lake_301_2)
    print(west_lake_301_3, "\n")
    print(west_lake_501_1)
    print(west_lake_501_2)
    print(west_lake_501_3, "\n")
    print(west_lake_508_1)
    print(west_lake_508_2, "\n")




    east_lake_url = 'https://myttc.ca/westbound_on_lake_shore_at_kipling.json'
    east_lake_request = requests.get(east_lake_url)

    east_lake = east_lake_request.json()

    east_lake_301_1 = {east_lake['stops'][4]['routes'][0]['stop_times'][0]['shape'][0:3]: east_lake['stops'][4]['routes'][0]['stop_times'][0]['departure_time']}
    east_lake_301_2 = {east_lake['stops'][4]['routes'][0]['stop_times'][0]['shape'][0:3]: east_lake['stops'][4]['routes'][0]['stop_times'][1]['departure_time']}
    east_lake_301_3 = {east_lake['stops'][4]['routes'][0]['stop_times'][0]['shape'][0:3]: east_lake['stops'][4]['routes'][0]['stop_times'][2]['departure_time']}

    east_lake_501_1 = {east_lake['stops'][4]['routes'][1]['stop_times'][0]['shape'][0:3]: east_lake['stops'][4]['routes'][1]['stop_times'][0]['departure_time']}
    east_lake_501_2 = {east_lake['stops'][4]['routes'][1]['stop_times'][0]['shape'][0:3]: east_lake['stops'][4]['routes'][1]['stop_times'][1]['departure_time']}
    east_lake_501_3 = {east_lake['stops'][4]['routes'][1]['stop_times'][0]['shape'][0:3]: east_lake['stops'][4]['routes'][1]['stop_times'][2]['departure_time']}

    east_lake_508_1 = {east_lake['stops'][4]['routes'][2]['stop_times'][0]['shape'][0:3]: east_lake['stops'][4]['routes'][2]['stop_times'][0]['departure_time']}
    east_lake_508_2 = {east_lake['stops'][4]['routes'][2]['stop_times'][0]['shape'][0:3]: east_lake['stops'][4]['routes'][2]['stop_times'][1]['departure_time']}
    east_lake_508_3 = {east_lake['stops'][4]['routes'][2]['stop_times'][0]['shape'][0:3]: east_lake['stops'][4]['routes'][2]['stop_times'][2]['departure_time']}


    print("East Side Bus")
    print(east_lake_301_1)
    print(east_lake_301_2)
    print(east_lake_301_3, "\n")
    print(east_lake_501_1)
    print(east_lake_501_2)
    print(east_lake_501_3, "\n")
    print(east_lake_508_1)
    print(east_lake_508_2)
    print(east_lake_508_3)


if __name__ == "__main__":
    main()

