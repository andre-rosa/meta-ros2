# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages specific to AStuff-provided sensors."
AUTHOR = "AutonomouStuff Software Development Team <software@autonomoustuff.com>"
HOMEPAGE = "http://wiki.ros.org/astuff_sensor_msgs"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    delphi-esr-msgs \
    delphi-srr-msgs \
    derived-object-msgs \
    ibeo-msgs \
    kartech-linear-actuator-msgs \
    mobileye-560-660-msgs \
    neobotix-usboard-msgs \
    pacmod-msgs \
    radar-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/astuff_sensor_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "200ab21862e037bb865160daa7ccd154"
SRC_URI[sha256sum] = "91f67f406cc09d6509d9639f61822a74c8ee42c17b423a06f21616576cd349ff"
S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-astuff_sensor_msgs-2.3.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/astuff-sensor-msgs/astuff-sensor-msgs_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/astuff-sensor-msgs/astuff-sensor-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/astuff-sensor-msgs/astuff-sensor-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/astuff-sensor-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/astuff-sensor-msgs/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
