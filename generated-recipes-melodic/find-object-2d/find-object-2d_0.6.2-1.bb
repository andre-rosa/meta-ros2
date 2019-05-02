# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The find_object_2d package"
AUTHOR = "Mathieu Labbe <matlabbe@gmail.com>"
HOMEPAGE = "http://find-object.googlecode.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "find_object_2d"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    image-transport \
    message-filters \
    qtbase \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    genmsg-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    image-transport \
    message-filters \
    qtbase \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    image-transport \
    message-filters \
    qtbase \
    roscpp \
    rospy \
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

SRC_URI = "https://github.com/introlab/find_object_2d-release/archive/release/melodic/find_object_2d/0.6.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b5ba626c2bdecf46b4acd92d2315cc20"
SRC_URI[sha256sum] = "7f868aa64cabd58c39cc11179f4d935c4c8399d9ebc5a59a561f352831eae527"
S = "${WORKDIR}/find_object_2d-release-release-melodic-find_object_2d-0.6.2-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/find-object-2d/find-object-2d_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/find-object-2d/find-object-2d_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/find-object-2d/find-object-2d-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/find-object-2d/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/find-object-2d/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
