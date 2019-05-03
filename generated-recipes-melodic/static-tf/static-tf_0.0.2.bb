# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The static_tf package"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "TODO"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=2feaf30a620f46f06a4b016624acf46f"

ROS_BPN = "static_tf"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    rospy \
    tf \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    rospy \
    tf \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    rospy \
    tf \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/wu-robotics/static_tf_release/archive/release/melodic/static_tf/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "14e484f9b339c71f05e804871732658a"
SRC_URI[sha256sum] = "0c372214894f09c32cf9f0e8364ee57db00a1a906ba997b8767c027bf835e1f8"
S = "${WORKDIR}/static_tf_release-release-melodic-static_tf-0.0.2-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('static-tf', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/static-tf/static-tf_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/static-tf/static-tf-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/static-tf/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/static-tf/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
