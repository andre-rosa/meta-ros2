# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Driver for the Phidgets Spatial 3/3/3 devices"
AUTHOR = "Martin Guenther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Ivan Dryanovski <ccnyroboticslab@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/phidgets_imu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "phidgets_drivers"
ROS_BPN = "phidgets_imu"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    nodelet \
    phidgets-api \
    pluginlib \
    roscpp \
    roslaunch \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-aggregator \
    diagnostic-msgs \
    diagnostic-updater \
    imu-filter-madgwick \
    nodelet \
    phidgets-api \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-aggregator \
    diagnostic-msgs \
    diagnostic-updater \
    imu-filter-madgwick \
    nodelet \
    phidgets-api \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/phidgets_imu/0.7.8-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e286651d19ffed7720f1e705ef0ef537"
SRC_URI[sha256sum] = "11d6e527269e2e1a3e0f982bbc594b4d403391a20a505b47806f49466ad1c2e7"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-phidgets_imu-0.7.8-1"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('phidgets-drivers', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('phidgets-drivers', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/phidgets-drivers/phidgets-drivers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/phidgets-drivers/phidgets-drivers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/phidgets-drivers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/phidgets-drivers/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
