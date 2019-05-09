# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The public fetch_drivers package is a binary only release.      fetch_drivers contains both the drivers and firmware for the fetch and freight research robots.     There should be no reason to use these drivers unless you're running on a fetch or a freight research robot.     This package, is a cmake/make only package which installs the binaries for the drivers and firmware."
AUTHOR = "Alexander Moriarty <amoriarty@fetchrobotics.com>"
ROS_AUTHOR = "Alexander Moriarty <amoriarty@fetchrobotics.com>"
HOMEPAGE = "https://wiki.ros.org/fetch_drivers"
SECTION = "devel"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "fetch_robots"
ROS_BPN = "fetch_drivers"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    boost \
    curl \
    diagnostic-msgs \
    fetch-auto-dock-msgs \
    fetch-driver-msgs \
    liburdfdom-dev \
    mk \
    nav-msgs \
    power-msgs \
    robot-calibration-msgs \
    robot-controllers \
    robot-controllers-interface \
    rosconsole \
    roscpp \
    roscpp-serialization \
    rospack \
    rostime \
    sensor-msgs \
    urdf \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    boost \
    curl \
    diagnostic-msgs \
    fetch-auto-dock-msgs \
    fetch-driver-msgs \
    liburdfdom-dev \
    nav-msgs \
    power-msgs \
    robot-calibration-msgs \
    robot-controllers \
    robot-controllers-interface \
    rosconsole \
    roscpp \
    roscpp-serialization \
    rostime \
    sensor-msgs \
    urdf \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    boost \
    curl \
    diagnostic-msgs \
    fetch-auto-dock-msgs \
    fetch-driver-msgs \
    liburdfdom-dev \
    nav-msgs \
    power-msgs \
    robot-calibration-msgs \
    robot-controllers \
    robot-controllers-interface \
    rosconsole \
    roscpp \
    roscpp-serialization \
    rostime \
    sensor-msgs \
    urdf \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_robots-release/archive/release/melodic/fetch_drivers/0.8.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "be14311db43b8226bf83b91ff650ef45"
SRC_URI[sha256sum] = "bf7c846904d5af4fd6cd3591a534d336436666f15b3e1ec28e25d5c5f5c1c241"
S = "${WORKDIR}/fetch_robots-release-release-melodic-fetch_drivers-0.8.6-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('fetch-robots', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('fetch-robots', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-robots/fetch-robots_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-robots/fetch-robots-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-robots/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-robots/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
