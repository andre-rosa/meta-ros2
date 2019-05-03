# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The quaternion_operation package"
AUTHOR = "Masaya Kataoka <ms.kataoka@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Aoache v2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=dd29f9b27e3b4235c977e390f3efb659"

ROS_BPN = "quaternion_operation"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    libeigen \
    roscpp \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    libeigen \
    roscpp \
    rostest \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    libeigen \
    roscpp \
    rostest \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/OUXT-Polaris/quaternion_operation-release/archive/release/melodic/quaternion_operation/0.0.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fa86dcc8a74ace696b8516321a03f2c3"
SRC_URI[sha256sum] = "f33f3b9910bd5212fd5bc408af7d8f858c97fb58bc27f88fc5ca17ceeaccd15b"
S = "${WORKDIR}/quaternion_operation-release-release-melodic-quaternion_operation-0.0.1-2"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('quaternion-operation', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/quaternion-operation/quaternion-operation_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/quaternion-operation/quaternion-operation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/quaternion-operation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/quaternion-operation/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
