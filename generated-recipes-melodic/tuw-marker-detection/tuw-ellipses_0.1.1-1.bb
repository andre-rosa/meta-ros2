# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The tuw_ellipses package contains a computer vision library which is able to detect ellipses within images.       The package is able to estimate the pose of the circle related to the ellipse the circle diameter as well as the camera parameter are known.     A dynamic reconfigure interface allows the user to tune the parameter of the system to ones needs.     But be aware that the pose of a projected circle within a image (ellipse) has two solutions and only one is published as TF."
AUTHOR = "Markus Bader <markus.bader@tuwien.ac.at>"
ROS_AUTHOR = "Markus Bader"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "tuw_marker_detection"
ROS_BPN = "tuw_ellipses"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    libeigen \
    marker-msgs \
    nodelet \
    roscpp \
    rospy \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    marker-msgs \
    nodelet \
    roscpp \
    rospy \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    marker-msgs \
    nodelet \
    roscpp \
    rospy \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/melodic/tuw_ellipses/0.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "03e13bdbd3d6dd4f90863a66bddd5d48"
SRC_URI[sha256sum] = "6f40eb7c0d83f05f8dac8ce03ca8fd2c6a30876e06174e16d80d8909b84d8749"
S = "${WORKDIR}/tuw_marker_detection-release-release-melodic-tuw_ellipses-0.1.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('tuw-marker-detection', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('tuw-marker-detection', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tuw-marker-detection/tuw-marker-detection_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tuw-marker-detection/tuw-marker-detection-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tuw-marker-detection/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/tuw-marker-detection/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
