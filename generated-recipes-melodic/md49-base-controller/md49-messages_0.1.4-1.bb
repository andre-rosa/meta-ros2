# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The md49_messages package"
AUTHOR = "Fabian Prinzing <scheik.todeswache@googlemail.com>"
HOMEPAGE = "http://www.the-starbearer.de"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/Scheik/md49_base_controller-release/archive/release/melodic/md49_messages/0.1.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2646be98f683bea6c26cd5d50186b0d4"
SRC_URI[sha256sum] = "490add7ab7660314b642b0fc9275ef33506a09326194e3d91b21f1229f86d17c"
S = "${WORKDIR}/md49_base_controller-release-release-melodic-md49_messages-0.1.4-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/md49-base-controller/md49-base-controller_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/md49-base-controller/md49-base-controller_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/md49-base-controller/md49-base-controller-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/md49-base-controller/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/md49-base-controller/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
