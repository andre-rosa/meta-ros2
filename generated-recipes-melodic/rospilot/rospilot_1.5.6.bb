# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rospilot"
AUTHOR = "Christopher Berner <christopherberner@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_BUILD_DEPENDS = " \
    ffmpeg \
    geometry-msgs \
    libgphoto-dev \
    libjpeq-turbo \
    libmicrohttpd \
    libnl-3-dev \
    message-generation \
    opencv \
    roscpp \
    roslint \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    curl \
    dnsmasq \
    gdal-bin \
    geometry-msgs \
    hostapd \
    libnl-3 \
    mapnik-utils \
    mavlink \
    message-runtime \
    osm2pgsql \
    postgresql-postgis \
    python-cherrypy \
    python-colorama \
    python-mapnik \
    python-psutil \
    python-serial \
    python-tilestache \
    rosbash \
    rosbridge-suite \
    roslaunch \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    unzip \
    vision-opencv \
    wget \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    curl \
    dnsmasq \
    gdal-bin \
    geometry-msgs \
    hostapd \
    libnl-3 \
    mapnik-utils \
    mavlink \
    message-runtime \
    osm2pgsql \
    postgresql-postgis \
    python-cherrypy \
    python-colorama \
    python-mapnik \
    python-psutil \
    python-serial \
    python-tilestache \
    rosbash \
    rosbridge-suite \
    roslaunch \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    unzip \
    vision-opencv \
    wget \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/rospilot/rospilot-release/archive/release/melodic/rospilot/1.5.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0d767ddb7a37ed1e0ee262f43cfd14ac"
SRC_URI[sha256sum] = "3e393fbfff16e69384d1a4d186439df31ff3667f3062c0b6fc28cebc4a689ee8"
S = "${WORKDIR}/rospilot-release-release-melodic-rospilot-1.5.6-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rospilot/rospilot_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rospilot/rospilot_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rospilot/rospilot-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rospilot/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rospilot/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
